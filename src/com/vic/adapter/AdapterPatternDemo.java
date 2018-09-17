package com.vic.adapter;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "aaa");
		audioPlayer.play("mp4", "bbb");
		audioPlayer.play("vlc", "ccc");
		audioPlayer.play("avi", "ddd");
	}
}
