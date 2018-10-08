package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.logging.Logger;

@RestController
public class HelloWildFlyController {
    Logger logger = Logger.getLogger(HelloWildFlyController.class.toString());


    @RequestMapping("hello")
    public String sayHello() {
        logger.info("sayHello");

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