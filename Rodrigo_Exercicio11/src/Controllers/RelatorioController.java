package Controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import View.RelatorioPDFView;
import Models.Animal;
import Models.Cao;
import Models.Gato;
import Models.Passaro;
import Models.Proprietario;

public class RelatorioController {
    private static final String URL = "jdbc:mysql://localhost:3306/bancoPet";
    private static final String USUARIO = "rodrigo";
    private static final String SENHA = "cruzeiro2703";

    public static void main(String[] args) {
        // Realiza o cadastro dos proprietários, cães, gatos e pássaros
        cadastrarProprietarios();
        cadastrarCaes();
        cadastrarGatos();
        cadastrarPassaros();

        // Monta o relatório
        List<Proprietario> proprietarios = recuperarProprietarios();
        RelatorioPDFView.gerarRelatorioPDF(proprietarios, null, 0);
    }

    public static void cadastrarProprietarios() {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection(URL, USUARIO, SENHA);

            String sql = "INSERT INTO Proprietario (CPF, nome, endereco, telefone) VALUES (?, ?, ?, ?)";

            statement = connection.prepareStatement(sql);

            // Cadastrar 4 proprietários
            statement.setString(1, "11111111111");
            statement.setString(2, "Proprietário 1");
            statement.setString(3, "Endereço 1");
            statement.setString(4, "Telefone 1");
            statement.executeUpdate();

            statement.setString(1, "22222222222");
            statement.setString(2, "Proprietário 2");
            statement.setString(3, "Endereço 2");
            statement.setString(4, "Telefone 2");
            statement.executeUpdate();

            statement.setString(1, "33333333333");
            statement.setString(2, "Proprietário 3");
            statement.setString(3, "Endereço 3");
            statement.setString(4, "Telefone 3");
            statement.executeUpdate();

            statement.setString(1, "44444444444");
            statement.setString(2, "Proprietário 4");
            statement.setString(3, "Endereço 4");
            statement.setString(4, "Telefone 4");
            statement.executeUpdate();

            System.out.println("Cadastro de proprietários concluído com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(connection, statement);
        }
    }

    public static void cadastrarCaes() {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection(URL, USUARIO, SENHA);

            String sql = "INSERT INTO Caes (id, porte, peso) VALUES (?, ?, ?)";

            statement = connection.prepareStatement(sql);

            // Cadastrar 3 cães
            statement.setInt(1, 1);
            statement.setString(2, "Porte 1");
            statement.setDouble(3, 10.5);
            statement.executeUpdate();

            statement.setInt(1, 2);
            statement.setString(2, "Porte 2");
            statement.setDouble(3, 15.0);
            statement.executeUpdate();

            statement.setInt(1, 4);
            statement.setString(2, "Porte 3");
            statement.setDouble(3, 8.2);
            statement.executeUpdate();

            System.out.println("Cadastro de cães concluído com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(connection, statement);
        }
    }

    public static void cadastrarGatos() {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection(URL, USUARIO, SENHA);

            String sql = "INSERT INTO Gatos (id, porte, peso) VALUES (?, ?, ?)";

            statement = connection.prepareStatement(sql);

            // Cadastrar 3 gatos
            statement.setInt(1, 3);
            statement.setString(2, "Porte 4");
            statement.setDouble(3, 5.7);
            statement.executeUpdate();

            System.out.println("Cadastro de gatos concluído com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(connection, statement);
        }
    }

    public static void cadastrarPassaros() {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection(URL, USUARIO, SENHA);

            String sql = "INSERT INTO Passaros (id, anilha) VALUES (?, ?)";

            statement = connection.prepareStatement(sql);

            // Cadastrar 4 pássaros
            statement.setInt(1, 1);
            statement.setInt(2, 1001);
            statement.executeUpdate();

            statement.setInt(1, 4);
            statement.setInt(2, 1004);
            statement.executeUpdate();

            System.out.println("Cadastro de pássaros concluído com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(connection, statement);
        }
    }

    public static List<Proprietario> recuperarProprietarios() {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Proprietario> proprietarios = new ArrayList<>();

        try {
            connection = DriverManager.getConnection(URL, USUARIO, SENHA);

            String sql = "SELECT p.CPF, p.nome, a.id, a.nome, a.sexo FROM Proprietario p " +
                    "LEFT JOIN RelPropAnimal rpa ON p.CPF = rpa.cpf " +
                    "LEFT JOIN Animais a ON rpa.id = a.id";

            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String cpf = resultSet.getString("CPF");
                String nomeProprietario = resultSet.getString("nome");
                int idAnimal = resultSet.getInt("id");
                String nomeAnimal = resultSet.getString("nome");
                String sexoAnimal = resultSet.getString("sexo");

                Proprietario proprietario = null;

                for (Proprietario p : proprietarios) {
                    if (p.getCpf().equals(cpf)) {
                        proprietario = p;
                        break;
                    }
                }

                if (proprietario == null) {
                    proprietario = new Proprietario(cpf, nomeProprietario, "", "");
                    proprietarios.add(proprietario);
                }

                Animal animal;

                if (resultSet.wasNull()) {
                    animal = null;
                } else {
                    if (idAnimal > 0) {
                        if (resultSet.wasNull()) {
                            animal = null;
                        } else if (resultSet.getString("porte") != null) {
                            String porte = resultSet.getString("porte");
                            double peso = resultSet.getDouble("peso");
                            animal = new Cao(idAnimal, nomeAnimal, porte, peso);
                        } else if (resultSet.getString("anilha") != null) {
                            int anilha = resultSet.getInt("anilha");
                            animal = new Passaro(idAnimal, nomeAnimal, anilha);
                        } else {
                            animal = new Gato(idAnimal, nomeAnimal, "", 0);
                        }
                        if (animal != null) {
                            proprietario.adicionarAnimal(animal);
                        }
                    }
                }
            }

            return proprietarios;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            closeResources(connection, statement, resultSet);
        }
    }

    private static void closeResources(Connection connection, PreparedStatement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void closeResources(Connection connection, PreparedStatement statement, ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            closeResources(connection, statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
