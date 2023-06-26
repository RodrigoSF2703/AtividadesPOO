package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Models.Proprietario;

public class ProprietarioDAO {
    public static void cadastrarProprietario(Proprietario proprietario) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.getConnection();
            String query = "INSERT INTO Proprietario (CPF, nome, endereco, telefone) VALUES (?, ?, ?, ?)";
            statement = connection.prepareStatement(query);
            statement.setString(1, proprietario.getCpf());
            statement.setString(2, proprietario.getNome());
            statement.setString(3, proprietario.getEndereco());
            statement.setString(4, proprietario.getTelefone());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(connection, statement);
        }
    }

    public static Proprietario buscarProprietario(String cpf) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Proprietario proprietario = null;

        try {
            connection = ConnectionFactory.getConnection();
            String query = "SELECT CPF, nome, endereco, telefone FROM Proprietario WHERE CPF = ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, cpf);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String nome = resultSet.getString("nome");
                String endereco = resultSet.getString("endereco");
                String telefone = resultSet.getString("telefone");
                proprietario = new Proprietario(cpf, nome, endereco, telefone);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(connection, statement, resultSet);
        }

        return proprietario;
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
}
