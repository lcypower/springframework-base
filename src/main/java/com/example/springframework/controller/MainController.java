package com.example.springframework.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/main")
public class MainController {

    @GetMapping("/get")
    public ResponseEntity<Object> getMain(){
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<Object> postMain(){
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/put")
    public ResponseEntity<Object> putMain(){
        return new ResponseEntity(HttpStatus.OK);
    }

    @PatchMapping("/patch")
    public ResponseEntity<Object> patchMain(){ return new ResponseEntity(HttpStatus.OK); }

    @DeleteMapping("/delete")
    public ResponseEntity<Object> deleteMain(){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }




}
