package Polimorphism;

import java.util.ArrayList;
import java.util.List;

public class PoliMain {
    public static void main(String[] args) {
        List<Car> listOfCars = new ArrayList<>();
        listOfCars.add(new Skoda(1992, "Superb"));
        listOfCars.add(new Fabia(2012));
        listOfCars.add(new RenaultMegane(2020));

        listOfCars.stream().forEach(car -> System.out.println(car));

        listOfCars.stream().forEach(Car::inviteYourOwner);
    }
}
