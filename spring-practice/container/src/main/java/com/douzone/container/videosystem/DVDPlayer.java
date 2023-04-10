package com.douzone.container.videosystem;

public class DVDPlayer {
	// interface를 주입(확장성 높아짐)
	private DigitalVideoDisc dvd;

	public DVDPlayer() {
	}
		
	// 생성자(Scanning X, 명시적으로 생성)
	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	
	public void play() {
		dvd.play();
	}

	public void setDvd(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	
	
}
