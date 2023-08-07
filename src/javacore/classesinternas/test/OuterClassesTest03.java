package javacore.classesinternas.test;

public class OuterClassesTest03 {

    private String name = "dudu";
    static class Nested{
        private String lasName = "cesar";
        void print(){
            System.out.println(new OuterClassesTest03().name + " " + lasName);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
