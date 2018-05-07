package damith.chandrasekara.cliniconline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		
		ModelAndView mav =new ModelAndView("page");
		mav.addObject("greeting","Welcome to Spring Web MVC");
		return mav;
	}

	@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value="greeting", required=false) String greeting) {
		if(greeting==null) {
		greeting="Hello There";	
		}
		ModelAndView mav =new ModelAndView("page");
		mav.addObject("greeting",greeting);
		return mav;
	}
	
	@RequestMapping(value="/find/{greeting}")
	public ModelAndView find(@PathVariable("greeting") String greeting) {
		if(greeting==null) {
		greeting="Hello Friend";	
		}
		ModelAndView mav =new ModelAndView("page");
		mav.addObject("greeting",greeting);
		return mav;
	}
}