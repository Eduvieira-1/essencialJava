package javacore.comportamento.test;

import javacore.comportamento.dominio.Car;
import javacore.comportamento.interfaces.CarPredicate;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;


public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2023));


    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2015);
        System.out.println(greenCars);
        System.out.println(yearBeforeCars);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filterColor = new ArrayList<>();
        for (Car car : cars) {
            if(carPredicate.test(car)){
                filterColor.add(car);
            }
        }
        return filterColor;
    }
}
