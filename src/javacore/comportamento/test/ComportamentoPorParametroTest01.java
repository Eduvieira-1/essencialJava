package javacore.comportamento.test;

import javacore.comportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2023));

    public static void main(String[] args) {
        System.out.println(filterByColor(cars, "green"));
        System.out.println(filterByYear(cars, 2000));
    }

    private static List<Car> filterByColor(List<Car> cars, String cor){
        List<Car> filterColor = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals(cor)){
                filterColor.add(car);
            }
        }
        return filterColor;
    }

    private static List<Car> filterByYear(List<Car> cars, int year){
        List<Car> filterYear = new ArrayList<>();
        for (Car car : cars) {
            if(car.getYear() < year){
                filterYear.add(car);
            }
        }
        return filterYear;
    }
}
