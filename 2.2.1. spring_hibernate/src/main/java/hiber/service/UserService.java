package hiber.service;

import hiber.model.User;
import org.hibernate.SessionFactory;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();

    String getUserByCar(String model, int series);

    SessionFactory getSession();
}
