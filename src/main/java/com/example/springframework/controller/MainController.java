package com.example.springframework.controller;

import com.example.springframework.dto.MainDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@RequestMapping("/api/main")
public class MainController {

    @GetMapping("/get-all")
    public ResponseEntity<Object> getMainAll(@ModelAttribute MainDTO.mainRequest param){
        return new ResponseEntity(param, HttpStatus.OK);
    }

    @GetMapping("/get-param")
    public ResponseEntity<Object> getMainParam(@RequestParam("id") String id, @RequestParam("name") String name, @RequestParam("level") int level){
        MainDTO.mainResponse param = new MainDTO.mainResponse();
        param.setId(id);
        param.setName(name);
        param.setLevel(level);
        return new ResponseEntity(param, HttpStatus.OK);
    }

    @GetMapping("/get-path/{pathvalue}")
    public ResponseEntity<Object> getMainPath(@PathVariable("pathvalue") String pathvalue){
        MainDTO.mainResponse param = new MainDTO.mainResponse();
        param.setId(pathvalue);
        return new ResponseEntity(param, HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<Object> postMain(@RequestBody MainDTO.mainRequest param){
        return new ResponseEntity(param, HttpStatus.CREATED);
    }

    @PutMapping("/put")
    public ResponseEntity<Object> putMain(){
        return new ResponseEntity(HttpStatus.OK);
    }

    @PatchMapping("/patch")
    public ResponseEntity<Object> patchMain() { return new ResponseEntity(HttpStatus.OK); }

    @DeleteMapping("/delete")
    public ResponseEntity<Object> deleteMain(){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
