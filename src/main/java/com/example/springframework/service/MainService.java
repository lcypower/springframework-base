package com.example.springframework.service;

import com.example.springframework.dto.MainDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MainService {
    public MainDTO.mainResponse getParam(MainDTO.mainRequest param) {
        MainDTO.mainResponse response = new MainDTO.mainResponse();
        response.setId(param.getId());
        response.setName(param.getName());
        response.setLevel(param.getLevel());
        log.info("Service in~");

        return response;
    }
}
