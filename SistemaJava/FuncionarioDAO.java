import java.sql.*;

public class FuncionarioDAO extends PessoaDAO<Funcionario> {

    @Override
    protected String tabela() { return "funcionarios"; }

    @Override
    protected Funcionario map(ResultSet rs) throws Exception {
        Funcionario f = new Funcionario();
        f.setId(rs.getInt("id"));
        f.setNome(rs.getString("nome"));
        f.setCargo(rs.getString("extra"));
        return f;
    }
}
