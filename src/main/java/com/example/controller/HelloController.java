package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class HelloController {

	@RequestMapping("/")
	public List<String> index() {
		return Arrays.asList("this is Spring Boot Sample!");
	}

	@RequestMapping("/json")
	public List<HelloUser> json() {
		HelloUser u1 = new HelloUser() {
			{
				setId("1");
				setName("Tanaka");
			}
		};
		HelloUser u2 = new HelloUser() {
			{
				setId("2");
				setName("Satou");
			}
		};

		List<HelloUser> l = Arrays.asList(u1, u2);

		return l;
	}

	public class HelloUser {
		String id;
		String name;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}