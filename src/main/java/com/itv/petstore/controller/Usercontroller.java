package com.itv.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itv.petstore.dtos.RegisterUserdto;
import com.itv.petstore.entities.User;
import com.itv.petstore.services.Userservices;

import jakarta.validation.Valid;

@RestController
public class Usercontroller {
    @Autowired
    private Userservices userservices;

    @PostMapping("/users")
    public User registerUser(@RequestBody @Valid RegisterUserdto registerUserdto)
    {
        return this.userservices.registereduser(registerUserdto);
    }


    @GetMapping("/users")
   public ResponseEntity<?>getAll()
   {
    return ResponseEntity.ok(this.userservices.getAll());
   }}
