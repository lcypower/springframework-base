package com.example.springframework.dto;

import lombok.Data;

public class MainDTO {
    @Data
    public static class mainRequest {
        private String id;
        private String name;
        private int level;
    }

    @Data
    public static class mainResponse {
        private String id;
        private String name;
        private int level;
    }
}
