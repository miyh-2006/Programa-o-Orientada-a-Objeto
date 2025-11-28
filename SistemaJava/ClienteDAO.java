import java.sql.*;

public class ClienteDAO extends PessoaDAO<Cliente> {

    @Override
    protected String tabela() { return "clientes"; }

    @Override
    protected Cliente map(ResultSet rs) throws Exception {
        Cliente c = new Cliente();
        c.setId(rs.getInt("id"));
        c.setNome(rs.getString("nome"));
        c.setTelefone(rs.getString("extra"));
        return c;
    }
}
