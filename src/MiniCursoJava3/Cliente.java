package MiniCursoJava3;

public class Cliente {
    private String nome;
    private int idade;
    private boolean nomeSujo;

    public Cliente(String nome, int idade, boolean nomeSujo) {
        this.nome = nome;
        this.idade = idade;
        this.nomeSujo = nomeSujo;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public boolean isNomeSujo() { return nomeSujo; }
}
