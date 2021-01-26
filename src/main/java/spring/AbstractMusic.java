package spring;

public abstract class AbstractMusic {
	private String name;
	
	public AbstractMusic(String name) {
		setName(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void playMusic() {
		System.out.println(name + " is playing");
	}
}
