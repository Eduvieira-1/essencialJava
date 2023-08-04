package javacore.classesinternas.test;

public class OuterClassesTest02 {
    private String nome = "dudu";

    void print(final String param){
        final String lastName = "Izuku";
        class LocalCalss{
            public void printLocal(){
                System.out.println(param);
                System.out.println(nome);
            }
        }
        new LocalCalss().printLocal();
    }
    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("");
    }
}
