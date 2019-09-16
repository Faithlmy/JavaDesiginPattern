package com.vic.adapter;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;
	@Override
	public void play(String type, String name) {
		// TODO Auto-generated method stub
		if(type != null && type.equalsIgnoreCase("mp3")) {
			System.out.println("mp3 = " + name);
		}else if(type != null && type.equalsIgnoreCase("vlc") || type.equalsIgnoreCase("mp4")) {
			 mediaAdapter = new MediaAdapter(type);
	         mediaAdapter.play(type, name);
		}else {
			System.out.println(type + "  format not supported");
		}
	}

}
