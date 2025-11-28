public class Cliente extends Pessoa {
    private String telefone;

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    @Override
    public void mostrarInfo() {
        System.out.println("[Cliente] ID: " + id + " | Nome: " + nome + " | Tel: " + telefone);
    }
}
