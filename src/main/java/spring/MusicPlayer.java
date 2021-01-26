package spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component
public class MusicPlayer {
	private int volume;
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	private int currentMusic;
	private ArrayList<AbstractMusic> musics = new ArrayList<AbstractMusic>();
	
	public String toString() {
		return "Volume: " + volume + " Musics in list: " + musics.size();
	}
	
	public void addMusic(AbstractMusic music) {
		musics.add(music);
	}
	
	public void playNext() {
		musics.get(currentMusic).playMusic();
		currentMusic++;
	}
	
	public void playAll() {
		for(int i = 0; i < musics.size(); i++) {
			playNext();
		}
	}
}
