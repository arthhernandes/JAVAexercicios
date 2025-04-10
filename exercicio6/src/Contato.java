public class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public void exibirContatos(){
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
    }
}
