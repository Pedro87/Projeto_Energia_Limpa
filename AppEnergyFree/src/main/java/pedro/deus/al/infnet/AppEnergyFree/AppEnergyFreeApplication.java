package pedro.deus.al.infnet.AppEnergyFree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AppEnergyFreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppEnergyFreeApplication.class, args);
	}

}
