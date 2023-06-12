import conexao.ConexaoBancoDados;
import model.Pessoa;
import dao.PessoaDAO;

public class Main {
    public static void main(String[] args) {
        // Testar a conexão com o banco de dados
        if (ConexaoBancoDados.testarConexão()) {
            System.out.println("Conexão estabelecida com sucesso.");

            // Criar objeto PessoaDAO
            PessoaDAO pessoaDAO = new PessoaDAO();

            try {
                // Realizar o select * na base
                System.out.println("Selecionando todas as pessoas na base:");
                pessoaDAO.selectAll();

                // Inserir 5 registros de pessoas na tabela cadastro
                System.out.println("Inserindo registros de pessoas:");
                pessoaDAO.insert(new Pessoa("111111123", "Rodrigo", "Rua TecoTeco", "2000-01-01"));
                pessoaDAO.insert(new Pessoa("121212123", "Rodriguinho", "Rua Chama Apagada", "1990-05-15"));
                pessoaDAO.insert(new Pessoa("122313213", "Cleitinho", "Rua Agua Seca", "1985-10-20"));
                pessoaDAO.insert(new Pessoa("141411414", "Mario", "Rua dos Encanadores", "1978-03-30"));
                pessoaDAO.insert(new Pessoa("151515151", "Maria", "Rua Vai com as Outras", "1995-12-10"));

                // Realizar o select * na base
                System.out.println("Selecionando todas as pessoas na base após a inserção:");
                pessoaDAO.selectAll();

                // Atualizar o 3º registro
                System.out.println("Atualizando o 3º registro:");
                pessoaDAO.update(new Pessoa("33333333333", "ReiArthur", "Rua da mesa quadrada", "1985-10-20"), "1234567890", "Beltrano");

                // Realizar o select * na base
                System.out.println("Selecionando todas as pessoas na base após a atualização:");
                pessoaDAO.selectAll();

                // Deletar 3 registros
                System.out.println("Deletando 3 registros:");
                pessoaDAO.delete("111111123");
                pessoaDAO.delete("122313213");
                pessoaDAO.delete("121212123");

                // Realizar o select * na base
                System.out.println("Selecionando todas as pessoas na base após a exclusão:");
                pessoaDAO.selectAll();

                // Deletar todos os registros
                System.out.println("Deletando todos os registros:");
                pessoaDAO.deleteAll();

                // Realizar o select * na base
                System.out.println("Selecionando todas as pessoas na base após a exclusão total:");
                pessoaDAO.selectAll();
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Fechar a conexão com o banco de dados
            try {
                ConexaoBancoDados.fecharConexao();
                System.out.println("Conexão fechada com sucesso.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Falha ao estabelecer conexão com o banco de dados.");
        }
    }
}
