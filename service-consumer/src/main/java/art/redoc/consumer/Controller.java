package art.redoc.consumer;

import art.redoc.api.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Reference(version = "0.1.0")
    private UserService userService;

    @RequestMapping("/")
    public String hello(String name){
        return userService.getName(name);
    }
}
