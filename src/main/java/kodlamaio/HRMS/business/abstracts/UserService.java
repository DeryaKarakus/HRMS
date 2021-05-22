package kodlamaio.HRMS.business.abstracts;

import kodlamaio.HRMS.entities.concretes.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User get(int id);
    void add(User user);
    void delete(User user);
    void update(User user);
    boolean emailCheck(String email);
    String password(User user);
}
