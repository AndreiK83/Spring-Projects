package ge.aka.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ge.aka.spring.beans.MusicPlayer;

public class SpringRun {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

		player.playAllMusics();
		System.out.println(player.getName());
		System.out.println(player.getVolume());

		context.close();
	}

}
