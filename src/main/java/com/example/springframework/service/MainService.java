package com.example.springframework.service;

import com.example.springframework.dto.MainDTO;
import org.springframework.stereotype.Service;

@Service
public class MainService {
    public MainDTO.mainResponse getParam(MainDTO.mainRequest param) {
        MainDTO.mainResponse response = new MainDTO.mainResponse();
        response.setId(param.getId());
        response.setName(param.getName());
        response.setLevel(param.getLevel());
        System.out.println("Service in~");

        return response;
    }
}
