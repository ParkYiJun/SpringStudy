package net.skhu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("third")
public class ThirdController {
	@RequestMapping("test1")
	public String test1(Model model) {
		Student student = new Student("reason", "3541613", "ydlwnsj25@gmail.com");
		model.addAttribute("student", student);
		return "third/test1";
	}

	@GetMapping("test2")
	public String test2(Model model) {
		model.addAttribute("student", new Student());
		return "third/test2";
	}

	@PostMapping("test2")
	public String test(Model model, Student s) {
		model.addAttribute("student", s);
		model.addAttribute("message", "전달되었습니다.");
		return "third/test1";
	}
}
