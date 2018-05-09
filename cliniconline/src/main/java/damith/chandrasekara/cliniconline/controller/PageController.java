package damith.chandrasekara.cliniconline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/","/home", "/index"})
	public ModelAndView index() {
		
		ModelAndView mav =new ModelAndView("page");
		mav.addObject("title","Home");
		mav.addObject("UserClickedHome",true);
		return mav;
	}
	
	@RequestMapping(value = "/doctors")
	public ModelAndView doctors() {
		
		ModelAndView mav =new ModelAndView("page");
		mav.addObject("title","Find Doctors");
		mav.addObject("UserClickedDoctors",true);
		return mav;
	}
	
	@RequestMapping(value = "/meditest")
	public ModelAndView services() {
		
		ModelAndView mav =new ModelAndView("page");
		mav.addObject("title","Medical Services");
		mav.addObject("UserClickeServices",true);
		return mav;
	}
	
	@RequestMapping(value = "/ambulance")
	public ModelAndView ambulance() {
		
		ModelAndView mav =new ModelAndView("page");
		mav.addObject("title","Ambulance");
		mav.addObject("UserClickeAmbulanc",true);
		return mav;
	}
	@RequestMapping(value = "/location")
	public ModelAndView location() {
		
		ModelAndView mav =new ModelAndView("page");
		mav.addObject("title","Location");
		mav.addObject("UserClickedLocation",true);
		return mav;
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		
		ModelAndView mav =new ModelAndView("page");
		mav.addObject("title","Contact");
		mav.addObject("UserClickedLocation",true);
		return mav;
	}
}
