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
        nomes2.add("nomes2_test_1");
        nomes2.add("nomes2_test_2");
        nomes2.add("nomes2_test_3");
        nomes.remove("william");

        System.out.println("--------------------");
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
