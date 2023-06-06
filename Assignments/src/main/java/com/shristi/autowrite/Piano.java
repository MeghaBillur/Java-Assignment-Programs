package com.shristi.autowrite;

import org.springframework.stereotype.Component;

@Component("piano")
public class Piano implements Instrument {

	@Override
	public void play(String song) {
		System.out.println("Song is Played Using Piano "+song);
	}
}
