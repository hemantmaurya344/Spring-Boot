package com.springbootJPA;

import com.springbootJPA.dao.UserRepository;
import com.springbootJPA.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringBootwithJpaApplication {
    public static void main(String[] args) {
       ApplicationContext context =  SpringApplication.run(SpringBootwithJpaApplication.class, args);
       System.out.println("Running");

        UserRepository userRepository = context.getBean(UserRepository.class);

        User user = new User();
        user.setName("Hemantdfdsf /Maurya");
        User user1 = new User();
        user1.setName("sjdf lsdkkhads");
        User user2 = new User();
        user2.setName("dssdssdsflkfjkc");

        List<User> users = List.of(user,user2,user1);

//        Iterable<User> result =  userRepository.saveAll(users);

//        result.forEach(u ->{
//            System.out.println(u);
//        });

        // update
//        Optional<User> optional = userRepository.findById(15);

//        User user3 = optional.get();
//        user3.setName("sdfkl values");

//        userRepository.save(user3);
//        System.out.println(user3);


        // get
        // get all
//        Iterable<User> itr =  userRepository.findAll();
//        itr.forEach(u -> System.out.println(u));

        // get one

//        Optional<User> opt = userRepository.findById(2);
//        System.out.println(opt);

        // delete
        // delete all
//        userRepository.deleteAll();

        // delete by id
//        userRepository.deleteById(2);


        System.out.println(userRepository.findByName("Hemant Maurya"));
        System.out.println(userRepository.findAll());
    }

}
