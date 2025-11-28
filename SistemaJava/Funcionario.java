public class Funcionario extends Pessoa {
    private String cargo;

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    @Override
    public void mostrarInfo() {
        System.out.println("[Funcionario] ID: " + id + " | Nome: " + nome + " | Cargo: " + cargo);
    }
}
