import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        inicializarBanco();

        Scanner sc = new Scanner(System.in);
        ClienteDAO cdao = new ClienteDAO();
        FuncionarioDAO fdao = new FuncionarioDAO();

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Funcionario");
            System.out.println("3 - Listar Clientes");
            System.out.println("4 - Listar Funcionarios");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int op = sc.nextInt(); sc.nextLine();

            if (op == 0) break;

            switch (op) {
                case 1 -> {
                    Cliente c = new Cliente();
                    System.out.print("Nome: ");
                    c.setNome(sc.nextLine());
                    System.out.print("Telefone: ");
                    c.setTelefone(sc.nextLine());
                    cdao.inserir(c);
                }
                case 2 -> {
                    Funcionario f = new Funcionario();
                    System.out.print("Nome: ");
                    f.setNome(sc.nextLine());
                    System.out.print("Cargo: ");
                    f.setCargo(sc.nextLine());
                    fdao.inserir(f);
                }
                case 3 -> cdao.listar();
                case 4 -> fdao.listar();
                default -> System.out.println("Opção inválida");
            }
        }

        sc.close();
    }

    private static void inicializarBanco() throws Exception {
        try (Connection c = ConexaoBD.conectar(); Statement s = c.createStatement()) {
            s.execute("CREATE TABLE IF NOT EXISTS clientes (id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, extra TEXT);");
            s.execute("CREATE TABLE IF NOT EXISTS funcionarios (id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, extra TEXT);");
        }
    }
}
