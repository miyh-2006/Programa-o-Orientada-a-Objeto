import java.sql.*;

public class ConexaoBD {
    private static final String URL = "jdbc:sqlite:sistema.db";

    public static Connection conectar() throws Exception {
        return DriverManager.getConnection(URL);
    }
}
