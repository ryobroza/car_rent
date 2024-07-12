package enigma.car_rent.service;

import enigma.car_rent.model.Rent;
import enigma.car_rent.utils.dto.RentRequestDTO;

import java.util.List;


public interface RentService {
    Rent create(RentRequestDTO request);
    List<Rent> getAll();
    Rent getOne(Integer id);
    Rent update(Integer id, RentRequestDTO request);
    void delete(Integer id);
}
