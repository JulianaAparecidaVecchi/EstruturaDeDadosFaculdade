package exemploAna;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue filaDoBanco = new LinkedList();
        filaDoBanco.add("Pessoa01");
        System.out.println(filaDoBanco.toString());
        filaDoBanco.add("Pessoa02");
        System.out.println(filaDoBanco.toString());
        filaDoBanco.add("Pessoa03");
        System.out.println(filaDoBanco.toString());
        filaDoBanco.add("Pessoa04");
        System.out.println(filaDoBanco.toString());
        filaDoBanco.poll();
        System.out.println(filaDoBanco.toString());
    }
}
