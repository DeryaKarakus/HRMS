package kodlamaio.HRMS.business.concretes;

import kodlamaio.HRMS.business.abstracts.UserService;
import kodlamaio.HRMS.dataAccess.abstracts.UserDao;
import kodlamaio.HRMS.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public List<User> getAll() {
        return this.userDao.findAll();
    }

    @Override
    public User get(int id) {
        return this.userDao.findById(id).orElse(null);
    }

    @Override
    public void add(User user) {
        this.userDao.save(user);

    }

    @Override
    public void delete(User user) {
        this.userDao.delete(user);

    }

    @Override
    public void update(User user) {
        this.userDao.save(user);

    }

    @Override
    public boolean emailCheck(String email) {
        return this.userDao.emailCheck(email);
    }


    @Override
    public String password(User user) {
        System.out.println(password(user));
        return null;
    }
}
