package web.service;

import org.springframework.stereotype.Service;
import web.data.CarData;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = CarData.getCars();
        if (count >= cars.size()) {
            return cars; // Если count больше или равен количеству машин, возвращаем весь список
        }
        return cars.subList(0, count); // Возвращаем подсписок с указанным количеством машин
    }
}
