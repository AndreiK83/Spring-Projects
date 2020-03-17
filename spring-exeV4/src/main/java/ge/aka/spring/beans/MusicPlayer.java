package ge.aka.spring.beans;

import java.util.ArrayList;
import java.util.List;

import ge.aka.spring.interfaces.Music;

public class MusicPlayer {
	
	private String name;
	private int volume;
	private List<Music> musics = new ArrayList<Music>();

	public MusicPlayer(List<Music> musics) {
		this.musics = musics;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public List<Music> getMusics() {
		return musics;
	}

	public void setMusics(List<Music> musics) {
		this.musics = musics;
	}

	public void playMusic() {
		System.out.println("Is playing " + musics.get(0).getSong());
	}

//	public List<Music> playAllMusics() {
//		List<Music> musics = new ArrayList<Music>();
//		for (Music music : musics) {
//			musics.add(music);
//			System.out.println("Is playing: " + music.getSong());
//		}
//		return musics;
//	}
	
	public void playAllMusics() {
		for (Music music : musics) {
			System.out.println("Is playing: " + music.getSong());
		}
	}
}
