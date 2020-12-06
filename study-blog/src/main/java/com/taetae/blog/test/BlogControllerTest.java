package com.taetae.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {

		@GetMapping("/blog/test")
		public String Test() {
			String returnTag = "<div style='text-align:center;'>";
			returnTag += "<div style='width:500px; height:500px; display:inline-block; background-color:yellow;'>";
			returnTag += "<h1 style='text-align:center;'>Test Controller</h1>";
			returnTag += "<h2 style='text-align:center;'>HELLO FIRST SPRING BOOT zzz</h2>";
			returnTag += "</div></div>";
			return returnTag;
		}
		
}
