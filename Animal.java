import java.util.ArrayList;

// Superclasse Animal
class Animal {

    private long id;
    private String nome;
    private int idade;
    private double peso;
    private ArrayList<String> habilidades;

    public Animal(long id, String nome, int idade, double peso) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.habilidades = new ArrayList<>();
    }

    // Getters e setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    // Retorna o som que o animal faz
    public String sound() {
        return "";
    }

    // Verifica se o animal pode realizar uma habilidade
    public String performAbility(String habilidade) {
        if (habilidades.contains(habilidade)) {
            return nome + " can " + habilidade;
        } else {
            return nome + " cannot " + habilidade;
        }
    }
}