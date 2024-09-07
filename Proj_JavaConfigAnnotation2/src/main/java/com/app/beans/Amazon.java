package com.app.beans;

import org.springframework.stereotype.Repository;

import jakarta.annotation.Resource;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("myamazon")
public class Amazon {
	
	
	@Resource(name="devry")
	private LogisticService logisticService;

	@Override
	public String toString() {
		return "Amazon [logisticService=" + logisticService + "]";
	}

}
