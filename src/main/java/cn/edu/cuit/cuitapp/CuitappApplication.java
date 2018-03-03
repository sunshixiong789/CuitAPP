package cn.edu.cuit.cuitapp;

import com.didispace.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableSwagger2Doc
public class CuitappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CuitappApplication.class, args);
	}
}
