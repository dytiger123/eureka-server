package org.dytiger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/sba")
	public String test() {
		return "sba";
	}
	
}
