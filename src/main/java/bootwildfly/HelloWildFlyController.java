package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


@RestController
public class HelloWildFlyController {
    Logger logger = LogManager.getLogger(HelloWildFlyController.class);


    @RequestMapping("hello")
    public String sayHello() {
        logger.debug("sayHello");
        return
                String.format("{\"hello_ms\": %d}", System.currentTimeMillis());
    }

    @RequestMapping("getmessages")
    public String readFromKafka() {
        logger.debug("getmessages");

        return
                String.format("{\"messages\": %s}", "N/A");
    }
}