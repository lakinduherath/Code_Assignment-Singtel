package com.singtel.assignment.model;

import com.singtel.assignment.model.features.Flying;
import com.singtel.assignment.model.features.Singing;
import com.singtel.assignment.model.features.Walking;

public class Bird implements Walking, Flying, Singing{

	@Override
	public String walk() {
		return "I am walking";
	}

	@Override
	public String fly() {
		return "I am flying";
	}

	@Override
	public String sing() {
		return "I am singing";
	}

}
