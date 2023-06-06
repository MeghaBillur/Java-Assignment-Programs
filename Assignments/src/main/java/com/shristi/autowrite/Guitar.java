package com.shristi.autowrite;

import org.springframework.stereotype.Component;

@Component("gitar")
public class Guitar implements Instrument {

	@Override
	public void play(String song) {
		System.out.println("Song is Played Using Guitar "+song);
	}
}
