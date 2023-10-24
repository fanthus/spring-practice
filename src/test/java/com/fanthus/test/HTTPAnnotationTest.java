package com.fanthus.test;

import com.fanthus.springpractice.controller.HTTPAnnotationController;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class HTTPAnnotationTest {

    @Test
    public void test() {
        HTTPAnnotationController controller = new HTTPAnnotationController();
        String value = controller.getParamNoAnnotation("22");
        log.info("value {}", value);
    }
}

