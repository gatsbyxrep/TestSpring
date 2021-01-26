package spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class RockMusic extends AbstractMusic {
	public RockMusic(String name) {
		super(name);
	}
	public void playMusic() {
		System.out.print("Rock music "); 
		super.playMusic();
	}
}
