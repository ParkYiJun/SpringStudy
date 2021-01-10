package net.skhu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/third")
public class ThirdController {
	@RequestMapping("test1")
	public String test1(Model model) {
		Student student = new Student("reason", "3541613", "ydlwnsj25@gmail.com");
		model.addAttribute("student", student);
		return "third/test1";
	}
}
