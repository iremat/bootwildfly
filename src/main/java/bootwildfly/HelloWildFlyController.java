package bootwildfly;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {
    Logger logger = LoggerFactory.getLogger(HelloWildFlyController.class.toString());


    @RequestMapping("hello")
    public String sayHello() {
        logger.debug("sayHello");

        System.out.println("SayHello system");

        return
                String.format("{\"hello_ms\": %d}", System.currentTimeMillis());
    }

    @RequestMapping("getmessages")
    public String readFromKafka() {
        logger.info("getmessages");

        System.out.println("get mesages system");

        return
                String.format("{\"messages\": %s}", "N/A");
    }
}