package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Models.Animal;
import Models.Cao;
import Models.Gato;
import Models.Passaro;

public class AnimalDAO {
	public static void cadastrarAnimal(Animal animal) {
	    Connection connection = null;
	    PreparedStatement statement = null;
	    
	    try {
	        connection = ConnectionFactory.getConnection();
	        String query = "INSERT INTO Animais (id, nome, idade, raca, cor, sexo, tipo, porte, peso, anilha) " +
	                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	        statement = connection.prepareStatement(query);
	        statement.setInt(1, animal.getId());
	        statement.setString(2, animal.getNome());
	        statement.setInt(3, animal.getIdade());
	        statement.setString(4, animal.getRaca());
	        statement.setString(5, animal.getCor());
	        statement.setString(6, animal.getSexo());
	        
	        if (animal instanceof Cao) {
	            statement.setString(7, "Cao");
	            statement.setString(8, ((Cao) animal).getPorte());
	            statement.setDouble(9, ((Cao) animal).getPeso());
	            statement.setNull(10, java.sql.Types.INTEGER);
	        } else if (animal instanceof Gato) {
	            statement.setString(7, "Gato");
	            statement.setString(8, ((Gato) animal).getPorte());
	            statement.setDouble(9, ((Gato) animal).getPeso());
	            statement.setNull(10, java.sql.Types.INTEGER);
	        } else if (animal instanceof Passaro) {
	            statement.setString(7, "Passaro");
	            statement.setNull(8, java.sql.Types.VARCHAR);
	            statement.setNull(9, java.sql.Types.DECIMAL);
	            statement.setInt(10, ((Passaro) animal).getAnilha());
	        }
	        
	        statement.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        closeResources(connection, statement);
	    }
	}
    public static Animal buscarAnimal(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Animal animal = null;

        try {
            connection = ConnectionFactory.getConnection();
            String query = "SELECT id, nome, idade, raca, cor, sexo, tipo, porte, peso, anilha FROM Animais WHERE id = ?";
            statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String nome = resultSet.getString("nome");
                int idade = resultSet.getInt("idade");
                String raca = resultSet.getString("raca");
                String cor = resultSet.getString("cor");
                String sexo = resultSet.getString("sexo");
                String tipo = resultSet.getString("tipo");
                String porte = resultSet.getString("porte");
                double peso = resultSet.getDouble("peso");
                int anilha = resultSet.getInt("anilha");

                if (tipo.equals("Cao")) {
                    animal = new Cao(id, nome, idade, raca, cor, sexo, porte, peso);
                } else if (tipo.equals("Gato")) {
                    animal = new Gato(id, nome, idade, raca, cor, sexo, porte, peso);
                } else if (tipo.equals("Passaro")) {
                    animal = new Passaro(id, nome, idade, raca, cor, sexo, anilha);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(connection, statement, resultSet);
        }

        return animal;
    }

    public static List<Animal> buscarTodosAnimais() {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Animal> animais = new ArrayList<>();

        try {
            connection = ConnectionFactory.getConnection();
            String query = "SELECT id, nome, idade, raca, cor, sexo, tipo, porte, peso, anilha FROM Animais";
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                int idade = resultSet.getInt("idade");
                String raca = resultSet.getString("raca");
                String cor = resultSet.getString("cor");
                String sexo = resultSet.getString("sexo");
                String tipo = resultSet.getString("tipo");
                String porte = resultSet.getString("porte");
                double peso = resultSet.getDouble("peso");
                int anilha = resultSet.getInt("anilha");

                Animal animal = null;

                if (tipo.equals("Cao")) {
                    animal = new Cao(id, nome, idade, raca, cor, sexo, porte, peso);
                } else if (tipo.equals("Gato")) {
                    animal = new Gato(id, nome, idade, raca, cor, sexo, porte, peso);
                } else if (tipo.equals("Passaro")) {
                    animal = new Passaro(id, nome, idade, raca, cor, sexo, anilha);
                }

                if (animal != null) {
                    animais.add(animal);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(connection, statement, resultSet);
        }

        return animais;
    }

    private static void closeResources(Connection connection, PreparedStatement statement, ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
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
