package com.singtel.assignment.model;

import com.singtel.assignment.model.features.Sounding;

public class Parrot extends Bird {
	
	private String sound;
	
	public Parrot(Sounding imitatingSound) {
        this.sound = imitatingSound.sound();
    }
	
	@Override
	public String sing() {
		return sound;
	}

}
