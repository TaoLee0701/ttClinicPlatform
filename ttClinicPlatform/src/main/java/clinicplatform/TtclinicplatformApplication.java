package clinicplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("clinicplatform.mapper")
public class TtclinicplatformApplication {
    public static void main(String[] args) {
        SpringApplication.run(TtclinicplatformApplication.class, args);
    }
}
