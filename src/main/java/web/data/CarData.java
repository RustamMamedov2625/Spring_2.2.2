package web.data;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public abstract class CarData {
    private static final List<Car> allCars = new ArrayList<>();

    static {
        allCars.add(new Car(1, "Car1", 2000));
        allCars.add(new Car(2, "Car2", 2001));
        allCars.add(new Car(3, "Car3", 2002));
        allCars.add(new Car(4, "Car4", 2003));
        allCars.add(new Car(5, "Car5", 2004));
    }

    public static List<Car> getCars() {
        return allCars;
    }
}
