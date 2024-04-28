package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    @Override
    public List<Car> addCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota Camry", "ABC123", 2020));
        cars.add(new Car("Honda Accord", "DEF456", 2021));
        cars.add(new Car("Ford Mustang", "GHI789", 2019));
        cars.add(new Car("Chevrolet Cruze", "JKL012", 2018));
        cars.add(new Car("Tesla Model S", "MNO345", 2022));
        return cars;
    }

    @Override
    public List<Car> getCarsByCount(List<Car> allCars, int count) {
        // если сщгте отрицательные - выведится пустой список
        int size = Math.max(0, Math.min(count, allCars.size()));
        return allCars.subList(0, size);
    }
}
