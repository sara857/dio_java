import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "src.main.java")
public class DioSpringSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioSpringSecurityJwtApplication.class, args);
	}

}
