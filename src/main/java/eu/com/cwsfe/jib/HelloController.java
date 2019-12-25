package eu.com.cwsfe.jib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String hello() {
        LOGGER.info("Hello invoked");
        return "hello";
    }

    @GetMapping("/exception")
    public String exception() {
        LOGGER.info("Exception invoked");
        throw new RuntimeException("Some error");
    }
}
