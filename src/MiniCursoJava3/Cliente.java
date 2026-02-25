package MiniCursoJava3;

public class Cliente {
    private String nome;
    private int idade;
    private boolean nomeSujo;

    // Construtor que o seu print utiliza
    public Cliente(String nome, int idade, boolean nomeSujo) {
        this.nome = nome;
        this.idade = idade;
        this.nomeSujo = nomeSujo;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public boolean isNomeSujo() { return nomeSujo; }
}