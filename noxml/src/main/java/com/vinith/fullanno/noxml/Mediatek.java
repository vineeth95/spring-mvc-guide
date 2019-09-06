package com.vinith.fullanno.noxml;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Mediatek implements MobileProcessor {
	
	public void process() {
		System.out.println("Mediatek added");

	}

}
