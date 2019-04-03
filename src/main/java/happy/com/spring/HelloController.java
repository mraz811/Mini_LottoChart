package happy.com.spring;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping(value="/hello.do" , method=RequestMethod.GET)
	public String hello(String name, Model model) {
		logger.warn("intro Controller" + new Date());
		model.addAttribute("hello", name+"입니다");
		return "hello";
	}
}





