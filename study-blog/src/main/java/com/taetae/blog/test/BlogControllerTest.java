package com.taetae.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {

		@GetMapping("/blog/test")
		public String Test() {
			return "<h1>Test Controller</h1>";
		}
		
}
