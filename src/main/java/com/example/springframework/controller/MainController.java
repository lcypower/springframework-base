package com.example.springframework.controller;

import com.example.springframework.dto.MainDTO;
import com.example.springframework.exception.CustomException;
import com.example.springframework.exception.Errors;
import com.example.springframework.service.MainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/main")
@RequiredArgsConstructor
@Slf4j
public class MainController {

    private final MainService mainService;

    @GetMapping("/get-all")
    public ResponseEntity<Object> getMainAll(@ModelAttribute MainDTO.mainRequest param){
        log.info("Controller in~");
        MainDTO.mainResponse response = this.mainService.getParam(param);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/get-param")
    public ResponseEntity<Object> getMainParam(@RequestParam("id") String id, @RequestParam("name") String name, @RequestParam("level") int level){
        // 강제로 Exception 발생!
        throw new CustomException(Errors.INTERNAL_SERVER_ERROR);
//        MainDTO.mainResponse param = new MainDTO.mainResponse();
//        param.setId(id);
//        param.setName(name);
//        param.setLevel(level);
//        return new ResponseEntity(param, HttpStatus.OK);
    }

    @GetMapping("/get-path/{pathvalue}")
    public ResponseEntity<Object> getMainPath(@PathVariable("pathvalue") String pathvalue){
        MainDTO.mainResponse param = new MainDTO.mainResponse();
        param.setId(pathvalue);
        return new ResponseEntity(param, HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<Object> postMain(@RequestBody MainDTO.mainRequest param){
        return ResponseEntity.created(URI.create("/post/" + param.getId())).build();
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
