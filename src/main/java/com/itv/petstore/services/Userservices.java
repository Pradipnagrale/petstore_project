package com.itv.petstore.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.stereotype.Service;

import com.itv.petstore.dtos.RegisterUserdto;
import com.itv.petstore.entities.User;
@Service
public class Userservices {
    private Map<Integer,User>users=new HashMap<>();
    private AtomicInteger atomic=new AtomicInteger();
    public User registereduser(RegisterUserdto registerUserdto)
    {
       User user=new User();
       user.setId(atomic.incrementAndGet());
       user.setFirstname(registerUserdto.getFirstname());
       user.setLastname(registerUserdto.getLastname());
       user.setEmail(registerUserdto.getEmail());
       user.setPassword(registerUserdto.getPassword());
   
    user.setConfirmpassword(registerUserdto.getConfirmpassword());
       user.setMobile(registerUserdto.getMobile());
       user.setSalary(registerUserdto.getSalary());
       users.put(user.getId(),user);
       return user;
    }
    public Collection<User>getAll()
    {
          return users.values();
    }

}
