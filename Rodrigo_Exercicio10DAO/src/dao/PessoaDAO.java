package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexao.ConexaoBancoDados;
import model.Pessoa;

public class PessoaDAO {
    private Connection connection;

    public PessoaDAO() {
        connection = ConexaoBancoDados.getConnection();
    }

    public void selectAll() {
        try {
            String query = "SELECT * FROM cadastro";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String cpf = resultSet.getString("CPF");
                String nome = resultSet.getString("nome");
                String endereco = resultSet.getString("endereco");
                String dataNascimento = resultSet.getString("data_nascimento");

                System.out.println("CPF: " + cpf + ", Nome: " + nome + ", Endereço: " + endereco + ", Data de Nascimento: " + dataNascimento);
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert(Pessoa pessoa) {
        try {
            String query = "INSERT INTO cadastro (CPF, nome, endereco, data_nascimento) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, pessoa.getCpf());
            statement.setString(2, pessoa.getNome());
            statement.setString(3, pessoa.getEndereco());
            statement.setString(4, pessoa.getDataNascimento());

            statement.executeUpdate();
            statement.close();

            System.out.println("Pessoa inserida com sucesso.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Pessoa pessoa, String newCpf, String newNome) {
        try {
            String query = "UPDATE cadastro SET CPF = ?, nome = ? WHERE CPF = ?";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, newCpf);
            statement.setString(2, newNome);
            statement.setString(3, pessoa.getCpf());

            statement.executeUpdate();
            statement.close();

            System.out.println("Pessoa atualizada com sucesso.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String cpf) {
        try {
            String query = "DELETE FROM cadastro WHERE CPF = ?";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, cpf);

            statement.executeUpdate();
            statement.close();

            System.out.println("Pessoa deletada com sucesso.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteAll() {
        try {
            String query = "DELETE FROM cadastro";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.executeUpdate();
            statement.close();

            System.out.println("Todos os registros foram deletados com sucesso.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
