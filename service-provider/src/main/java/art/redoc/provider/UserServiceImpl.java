package art.redoc.provider;

import art.redoc.api.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service(version = "0.1.0")
@Component
public class UserServiceImpl implements UserService {
    @Override
    public String getName(String name) {
        return "Cain-" + name;
    }
}
