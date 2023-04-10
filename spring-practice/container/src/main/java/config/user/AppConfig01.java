package config.user;

import org.springframework.context.annotation.Bean;

import com.douzone.container.user.User;

public class AppConfig01 {
	
	@Bean
	// bean은 configuration의 method에 붙여줌
	public User user() {
		return new User();
	}
	
}
