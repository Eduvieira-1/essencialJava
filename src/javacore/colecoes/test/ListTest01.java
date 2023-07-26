package javacore.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
//      List nomes = new ArrayList(); //1.4
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Eduardo");
        nomes.add("cortella");
        nomes.add("cortella");
        nomes2.add("miranha");
        nomes2.add("miranha");
        nomes2.add("sla");
        nomes.remove("william");
        nomes.addAll(nomes2);

        for (Object nome : nomes){
            System.out.println(nome);
        }

        System.out.println("---------");

        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }


    }
}
