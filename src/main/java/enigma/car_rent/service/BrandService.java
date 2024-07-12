package enigma.car_rent.service;

import enigma.car_rent.model.Brand;
import enigma.car_rent.utils.SearchBrandRequest;

import java.util.List;


public interface BrandService {

    List<Brand> getAll();

    Brand getOne(Integer id);
    Brand create(Brand req);
    Brand update(Integer id, Brand req);
    void delete(Integer id);

}
