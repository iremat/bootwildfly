package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {
    @RequestMapping("hello")
    public String sayHello() {
        return
                String.format("{\"hello_ms\": %d}", System.currentTimeMillis());
    }

    @RequestMapping("getmessages")
    public String readFromKafka() {
        return
                String.format("{\"messages\": %s}", "N/A");
    }
}