import java.sql.*;

public abstract class PessoaDAO<T extends Pessoa> {

    protected abstract String tabela();
    protected abstract T map(ResultSet rs) throws Exception;

    public void inserir(T p) throws Exception {
        String sql = "INSERT INTO " + tabela() + " (nome, extra) VALUES (?, ?);";
        try (Connection c = ConexaoBD.conectar(); PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1, p.getNome());

            if (p instanceof Cliente cli) stmt.setString(2, cli.getTelefone());
            else if (p instanceof Funcionario f) stmt.setString(2, f.getCargo());

            stmt.executeUpdate();
        }
    }

    public void listar() throws Exception {
        String sql = "SELECT * FROM " + tabela() + ";";
        try (Connection c = ConexaoBD.conectar(); PreparedStatement stmt = c.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                T p = map(rs);
                p.mostrarInfo();
            }
        }
    }
}
