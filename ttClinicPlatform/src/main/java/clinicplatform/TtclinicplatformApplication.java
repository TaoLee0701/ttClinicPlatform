package clinicplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("clinicplatform.mapper")
@ComponentScan("clinicplatform.*")  //指定扫描包路径
public class TtclinicplatformApplication {
    public static void main(String[] args) {
        SpringApplication.run(TtclinicplatformApplication.class, args);
    }
}
