package io.oodles.controllerDemo.mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping("/demo")
	@ResponseBody
	public String demo() {
		return "hii oodles dev ...!";
	}
}
