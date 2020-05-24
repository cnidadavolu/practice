package com.learn.demorest.restful.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDAOService {

    public static List<User> users = new ArrayList<>();

    private int userCount =3;
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

    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        if(user.getId() == null){
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id){
        for(User usr: users){
            if (usr.getId() == id)
                return usr;
        }
        return null;
    }
}