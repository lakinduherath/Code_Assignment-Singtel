package com.singtel.assignment.model;

import com.singtel.assignment.model.features.Sounding;

public class Cat implements Animal, Sounding {

	@Override
	public String sound() {
		return "Meow";
	}

}
