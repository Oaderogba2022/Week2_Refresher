package ie.atu.week2.week2_refresh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Week2RefreshApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week2RefreshApplication.class, args);
    }

}
