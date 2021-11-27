package art.redoc.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class ApplicationProvider {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationProvider.class, args);
    }
}
