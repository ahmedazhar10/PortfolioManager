package com.spring.project.controllerTest;

import com.spring.project.controller.FutureController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class FutureControllerTest {

    @Autowired
    private FutureController controller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller);
    }

}
