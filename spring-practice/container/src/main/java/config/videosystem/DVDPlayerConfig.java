package config.videosystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.douzone.container.videosystem.Avengers;
import com.douzone.container.videosystem.DVDPlayer;
import com.douzone.container.videosystem.DigitalVideoDisc;
import com.douzone.container.videosystem.IronMan;

@Configuration
public class DVDPlayerConfig {
	@Bean(name="avengers")
	public Avengers avengers() {
		return new Avengers();
	}
	
	@Bean(name="ironman")
	public IronMan ironMan() {
		return new IronMan();
	}

	// 주입하기 1 : Bean 생성 메소드 직접 호출
	// @Bean
	public DVDPlayer dvdPlayer01() {
		return new DVDPlayer(avengers());
	}

	// 주입하기 2 : parameter를 통한 Bean 전달하기 : 생성자 주입
	// @Bean
	public DVDPlayer dvdPlayer02(DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}

	// 주입하기 3 : parameter를 통한 Bean 전달하기 : setter 주입
	// @Bean
	public DVDPlayer dvdPlayer03(DigitalVideoDisc dvd) {
		DVDPlayer dvdPlayer = new DVDPlayer();
		dvdPlayer.setDvd(dvd);
		return dvdPlayer;
	}

	// 주입하기 4 : 같은 타입이 생성된 경우(2개 이상)
	@Bean(name="player04")
	public DVDPlayer dvdPlayer04(@Qualifier("avengers") DigitalVideoDisc dvd) {
		DVDPlayer dvdPlayer = new DVDPlayer();
		dvdPlayer.setDvd(dvd);
		return dvdPlayer;
	}

}
