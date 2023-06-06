package com.shristi.autowrite;

import org.springframework.beans.factory.annotation.Autowired;
public class Performer {
	
	
	@Autowired 
	Instrument gitar; 
	
	
	//if bean name is same as the instance variable name
	@Autowired
	Instrument violin;   //autowiring by name
	
	@Autowired
	Instrument piano;
	void playSong(String type,String song)
	{
			if(type.equals("V"))
			{
				violin=new Violin();
				violin.play(song);
			}
			else if(type.equals("G"))
			{
				gitar=new Guitar();
				gitar.play(song);
			}
			else if(type.equals("P"))
			{
				piano=new Piano();
				piano.play(song);
			}
	}
}
