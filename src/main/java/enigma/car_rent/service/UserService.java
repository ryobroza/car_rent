package enigma.car_rent.service;

import enigma.car_rent.model.User;
import enigma.car_rent.utils.SearchUserRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface UserService {
    Page<User> getAll(String name, Pageable pageable);
    User getOne(Integer id);
    User create(User req);
    User update(Integer id, User req);
    void delete(Integer id);

}
