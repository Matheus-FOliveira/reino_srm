package matheus.ferraz.SRM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.sql.SQLOutput;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrmApplication.class, args);
		System.out.println("Está rodando");
	}
}
