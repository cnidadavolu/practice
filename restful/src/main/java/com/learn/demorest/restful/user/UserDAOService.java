package com.learn.demorest.restful.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDAOService {

    public static List<User> users = new ArrayList<>();

    static {
        users.add(User.builder()
                .id(1)
                .name("Chaitanya")
                .birthDate(new Date())
                .build());
        users.add(User.builder()
                .id(2)
                .name("Chai")
                .birthDate(new Date())
                .build());
        users.add(User.builder()
                .id(3)
                .name("Swetcha")
                .birthDate(new Date())
                .build());
    }

    private int userCount = 3;

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User usr : users) {
            if (usr.getId() == id)
                return usr;
        }
        return null;
    }

    public User deleteById(int id) {
        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }
}