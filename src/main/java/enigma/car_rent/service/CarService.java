package enigma.car_rent.service;

import enigma.car_rent.model.Car;

import enigma.car_rent.utils.dto.CarRequestDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;


public interface CarService {

    Page<Car> getAll(String name, Boolean available, Pageable pageable);
    Car getOne(Integer id);
    Car create(CarRequestDTO request);
    Car update(Integer id, Car req);
    void delete(Integer id);

}
