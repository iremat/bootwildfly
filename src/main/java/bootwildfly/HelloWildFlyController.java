package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloWildFlyController {
    Logger logger = LoggerFactory.getLogger(HelloWildFlyController.class);


    @RequestMapping("hello")
    public String sayHello() {
        logger.info("sayHello");
        logger.debug("sayHello deb");
        System.out.println("SayHello system");

        return
                String.format("{\"hello_ms\": %d}", System.currentTimeMillis());
    }

    @RequestMapping("getmessages")
    public String readFromKafka() {
        logger.info("getmessages");
        logger.debug("getmessages debug");
        System.out.println("get mesages system");

        return
                String.format("{\"messages\": %s}", "N/A");
    }
}