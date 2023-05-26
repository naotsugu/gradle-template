package com.example.model;

public class ModelGreeter {
    public String hello() {
        return new com.example.core.CoreGreeter().hello();
    }
   
}
