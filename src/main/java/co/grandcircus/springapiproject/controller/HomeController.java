package co.grandcircus.springapiproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("watchlist")
	public ModelAndView watchList() {
		return new ModelAndView("watchlist");
	}
	
	@RequestMapping("searchmovie")
	public ModelAndView searchMovie() {
		return new ModelAndView("searchmovie");
	}
	
}
