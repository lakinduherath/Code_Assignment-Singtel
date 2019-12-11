package com.singtel.assignment.model;

import com.singtel.assignment.model.features.Sounding;

public class Dog implements Animal, Sounding {

	@Override
	public String sound() {
		return "Woof, woof";
	}

}
