package patika_7_proje.service;

import patika_7_proje.model.User;

import java.util.HashSet;
import java.util.Set;

public class UserService {

    private static Set<User> users = new HashSet<>();

    public void create(String name, String email, String password) {

        User user = new User(name, email, password);

        boolean isCreated = users.add(user);
        if (isCreated) {
            System.out.println("Kullanıcı Oluşturuldu: " + email);
        } else {
            System.out.println("Girilen Email ile zatan bir kullanıcı vardır!" + email);
        }

    }

    public void list() {
        for (User user : users) {
            System.out.println(user.getName() + " -> " + user.getEmail());

        }
    }

    public User findUserByName(String userName) {

        User foundUser = null;

        for (User user : users) {
            if (user.getName().equals(userName)) {
                foundUser = user;
                break;
            }
        }
        return foundUser;

    }

    public User findUserByEmail(String email) {

        User foundUser = null;

        for (User user : users) {
            if (user.getName().equals(email)) {
                foundUser = user;
                break;
            }
        }
        System.out.println("Girilen Email ile kullanıcı bulundu!" + foundUser);

        return foundUser;
    }
}
