package com.spring.project.controllerTest;

import com.spring.project.controller.CashAccountController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CashAccountControllerTest {

    @Autowired
    private CashAccountController controller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller);
    }

}
