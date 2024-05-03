package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota Camry", "ABC123", 2020));
        cars.add(new Car("Honda Accord", "DEF456", 2021));
        cars.add(new Car("Ford Mustang", "GHI789", 2019));
        cars.add(new Car("Chevrolet Cruze", "JKL012", 2018));
        cars.add(new Car("Tesla Model S", "MNO345", 2022));
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        // если count отрицательное - выведется пустой список
        int size = Math.max(0, Math.min(count, cars.size()));
        return cars.subList(0, size);
    }
}
