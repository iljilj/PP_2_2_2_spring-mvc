package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String getCarsForTable(@RequestParam(name = "count", required = false, defaultValue = "-1") int count, ModelMap model) {
        CarService carService = new CarServiceImpl();
        List<Car> allCars = carService.addCars();
        List<Car> cars = carService.getCarsByCount(allCars, count);
        

        model.addAttribute("cars", cars);

        return "cars";

    }
}
