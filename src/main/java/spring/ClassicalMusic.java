package spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic extends AbstractMusic {
	public ClassicalMusic(String name) {
		super(name);
	}
	public void playMusic() {
		System.out.print("Classical music "); 
		super.playMusic();
	}
}
