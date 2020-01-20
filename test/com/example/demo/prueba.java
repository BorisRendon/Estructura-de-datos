package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class prueba {
    @Test
    public void test(){
        PrimeraTareaApplication test1 = new PrimeraTareaApplication();
        int resultado = test1.suma(4);
        assertEquals(10,resultado);
    }

}