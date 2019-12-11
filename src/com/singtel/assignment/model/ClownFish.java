package com.singtel.assignment.model;

import com.singtel.assignment.model.features.FishFeatures;

public class ClownFish extends Fish implements FishFeatures{

	@Override
	public String behaviour() {
		return "Make jokes";
	}

	@Override
	public String features() {
		return "Small and colourful (orange)";
	}

}
