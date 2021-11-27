package art.redoc.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class ApplicationConsumer {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationConsumer.class, args);
    }
}
