package com.singtel.assignment.model;

import com.singtel.assignment.model.features.Sounding;

public class Rooster extends Chicken implements Sounding{

	@Override
	public String chirp() {
		return "Cock-a-doodle-doo";
	}

	@Override
	public String sound() {
		return chirp();
	}
}
