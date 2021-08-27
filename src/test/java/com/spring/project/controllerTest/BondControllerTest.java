package com.spring.project.controllerTest;

import com.spring.project.controller.BondController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class BondControllerTest {

    @Autowired
    private BondController controller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller);
    }

}
