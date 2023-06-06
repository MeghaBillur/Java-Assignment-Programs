package com.shristi.autowrite;

import org.springframework.stereotype.Component;

@Component("violin")
public class Violin implements Instrument {

	@Override
	public void play(String song) {
		System.out.println("Song is Played Using Violoin "+song);
	}
}
