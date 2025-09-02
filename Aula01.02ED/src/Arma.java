public class Arma {
    private String nome;
    private double dano;

    public Arma(String nome, double dano) {
        this.nome = nome;
        this.dano = dano;
    }

    public Arma() {
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void atirar(){
        System.out.println("Atirando munições comuns. Dano causado = " + this.dano);
    }

}
