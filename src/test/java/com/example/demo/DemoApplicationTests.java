package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {




    @Test
    void contextLoads() {
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.trace("1");
        logger.debug("2");
        logger.info("3");
        logger.warn("4");
        logger.error("5");


    }

}
