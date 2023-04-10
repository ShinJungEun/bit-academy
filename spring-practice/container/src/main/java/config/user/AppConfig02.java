package config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.douzone.container.user.User;

@Configuration
public class AppConfig02 {
	
	@Bean
	// bean은 configuration의 method에 붙여줌
	public User user() {
		return new User("마이콜");
	}
	
}
