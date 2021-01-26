package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	@Bean
	@Scope("prototype")
	public ClassicalMusic classicalMusic(String name) {
		return new ClassicalMusic(name);
	}
	
	@Bean
	@Scope("prototype")
	public RockMusic rockMusic(String name) {
		return new RockMusic(name);
	}
	
	@Bean
	public MusicPlayer musicPlayer() {
		return new MusicPlayer();
	}

}
