package FishEdu.edu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@RestController
public class HelloController {

	@RequestMapping("/")
	String hello() {
		return "Hello World!";
	}

	@Data
	static class Result {
		public Result(int left, int right, long ans) {
			this.left = left;
			this.right = right;
			this.answer = ans;
		}

		int left;
		int right;
		long answer;
	}

}
