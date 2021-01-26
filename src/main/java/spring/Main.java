package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer.addMusic((AbstractMusic)context.getBean("rockMusic", "Bohemian rhapsody"));
		musicPlayer.addMusic((AbstractMusic)context.getBean("classicalMusic", "Moonlight sonata"));
		musicPlayer.setVolume(50);
		System.out.println(musicPlayer);
		musicPlayer.playAll();
		
		context.close();
	}

}
