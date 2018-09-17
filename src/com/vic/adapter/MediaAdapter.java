package com.vic.adapter;

public class MediaAdapter implements MediaPlayer {
	
	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String type) {
		// TODO Auto-generated constructor stub
		if(type != null && type.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer = new VlcPlayer();
		}else if(type != null && type.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer = new Mp4Play();
		}
	}

	@Override
	public void play(String type, String name) {
		// TODO Auto-generated method stub
		if(type != null && type.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer.playVlc(name);
		}else if(type != null && type.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer.playMp4(name);
		}
	}

}
