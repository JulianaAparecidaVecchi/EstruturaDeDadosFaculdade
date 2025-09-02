public abstract class Pessoa {
    private String nome;
    private String sexo;
    private double altura;

    public Pessoa(String nome, String sexo, double altura){
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public abstract void apresentar();
}
