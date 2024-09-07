package com.app.beans;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("myamazon")
public class Amazon {
	
	
	@Inject
	@Named("express")
	private LogisticService logisticService;

	@Override
	public String toString() {
		return "Amazon [logisticService=" + logisticService + "]";
	}

}
