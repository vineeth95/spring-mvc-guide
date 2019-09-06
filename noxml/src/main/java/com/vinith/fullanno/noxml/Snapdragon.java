package com.vinith.fullanno.noxml;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {

	public void process() {
		System.out.println("snapdragon added");

	}

}
