package com.spring.project.controllerTest;

import com.spring.project.controller.BondController;
import com.spring.project.controller.StockController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class StockControllerTest {

    @Autowired
    private StockController controller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller);
    }

}
