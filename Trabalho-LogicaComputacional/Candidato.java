public class Candidato {

    // Atributos do candidato
    private String id;
    private String nome;
    private int idade;
    private int experiencia;
    private boolean tecnico;
    private boolean ingles;

    // Método construtor
    public Candidato(String id, String nome, int idade, int experiencia, boolean tecnico, boolean ingles) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.experiencia = experiencia;
        this.tecnico = tecnico;
        this.ingles = ingles;
    }

    // Métodos get para acessar os dados do candidato
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public boolean temTecnico() {
        return tecnico;
    }

    public boolean temIngles() {
        return ingles;
    }
}