package com.example.SpringRestJUnit.controller;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(CalculatorApiController.class)
@AutoConfigureWebMvc

public class CalculatorApiControllerTest {
}
