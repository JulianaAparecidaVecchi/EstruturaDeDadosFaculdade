public class Habilidade {
    private String nome;
    private double ataque;
    private double defesa;

    public Habilidade(String nome, double ataque, double defesa) {
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public void atacar(){
        System.out.println("O heroi " + " usou sua habilidade " + this.nome + " para atacar o inimigo. Ataque = " + this.ataque);
    }

    public void defender(){
        System.out.println("O heroi usou sua habilidade " + this.nome + " para se defender do inimigo. Defesa = " + this.defesa);
    }
}
