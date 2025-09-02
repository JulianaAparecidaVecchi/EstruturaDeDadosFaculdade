import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /* Instanciar as armas */
        /* Armas comuns */
        Arma arma1000balas = new Arma("Arma1000balas", 1000);
        Arma armax77 = new Arma("Armax77", 7000);

        /* Armas especiais com munições de fogo */
        ArmaDeFogo armaSuperFogueira = new ArmaDeFogo("Arma super fogueira", 12000);
        ArmaDeFogo armaSuperMegaFogo = new ArmaDeFogo("Arma super mega fogo", 57000);

        /* Armas especiais com munições de gelo */
        ArmaDeGelo armaSuperGeladeira = new ArmaDeGelo("Arma super geladeira", 16000);
        ArmaDeGelo armaSuperMegaCongelante = new ArmaDeGelo("Arma super mega congelante", 156000);


        /* Instanciar as habilidades */
        Habilidade hVoo = new Habilidade("Voo", 0, 0);
        Habilidade hTelepatia = new Habilidade("Telepatia", 100, 2);
        Habilidade hVisaoRaioX = new Habilidade("Visão De Raio X", 170, 50);
        Habilidade hSuperForca = new Habilidade("Super Força", 182, 150);
        Habilidade hControleNatureza = new Habilidade("Controle Da Natureza(Todos os Elementos)", 1546, 1148);
        Habilidade hVelocidadeLuz = new Habilidade("Velocidade da Luz", 220, 180);
        Habilidade hInvisibilidade = new Habilidade("Invisibilidade", 130, 90);
        Habilidade hRegeneracao = new Habilidade("Regeneração", 200, 140);
        Habilidade hManipulacaoTempo = new Habilidade("Manipulação do Tempo", 400, 350);
        Habilidade hControleEletricidade = new Habilidade("Controle da Eletricidade", 270, 200);
        Habilidade hTeletransporte = new Habilidade("Teletransporte", 180, 120);
        Habilidade hCampoForca = new Habilidade("Campo de Força", 150, 100);
        Habilidade hExplosaoEnergia = new Habilidade("Explosão de Energia", 250, 210);
        Habilidade hControleSombras = new Habilidade("Controle das Sombras", 300, 270);

        /* Herói número 01 */
        System.out.println("-------------------------------");
        Heroi heroi01 = new Heroi("Juliana", "F", 1.60, true, "Batata Frita", armaSuperMegaCongelante);
        heroi01.getHabilidades().add(hSuperForca);
        heroi01.getHabilidades().add(hInvisibilidade);
        heroi01.getHabilidades().add(hVoo);
        heroi01.getHabilidades().add(hControleSombras);
        heroi01.apresentar();

        /* Mostrar ataque, defesa e arma do herói 01 */
        heroi01.getHabilidades().get(0).atacar();
        heroi01.getHabilidades().get(2).defender();
        heroi01.getArma().atirar();
        System.out.println("-------------------------------");


        /* Herói número 02 */
        Heroi heroi02 = new Heroi("Carlos", "M", 1.85, false, "Pizza", armaSuperFogueira);
        heroi02.getHabilidades().add(hTelepatia);
        heroi02.getHabilidades().add(hVelocidadeLuz);
        heroi02.getHabilidades().add(hCampoForca);

        heroi02.apresentar();

        /* Usando habilidades e arma do herói 02 */
        heroi02.getHabilidades().get(0).atacar();
        heroi02.getHabilidades().get(1).defender();
        heroi02.getArma().atirar();
        System.out.println("-------------------------------");



        /* Herói número 03 */
        Heroi heroi03 = new Heroi("Clara", "F", 1.70, true, "Sorvete", arma1000balas);
        heroi03.getHabilidades().add(hManipulacaoTempo);
        heroi03.getHabilidades().add(hControleEletricidade);
        heroi03.getHabilidades().add(hExplosaoEnergia);

        heroi03.apresentar();

        /* Usando habilidades e arma do herói 03 */
        heroi03.getHabilidades().get(2).atacar();
        heroi03.getHabilidades().get(0).defender();
        heroi03.getArma().atirar();
        System.out.println("-------------------------------");

    }
}
