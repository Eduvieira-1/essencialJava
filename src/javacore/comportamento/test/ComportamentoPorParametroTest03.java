package javacore.comportamento.test;

import javacore.comportamento.dominio.Car;
import javacore.comportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2023));


    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(greenCars);
        System.out.println(filter(nums, num -> num % 2 == 0));
    }

   private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filtered = new ArrayList<>();
       for (T e : list) {
           if(predicate.test(e)){
               filtered.add(e);
           }
       }
       return filtered;
   }
}
