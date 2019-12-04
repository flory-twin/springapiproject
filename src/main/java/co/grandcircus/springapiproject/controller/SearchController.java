package co.grandcircus.springapiproject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.springapiproject.models.TMDBServiceResponse;
import co.grandcircus.springapiproject.services.TheMovieDbService;

@Controller
public class SearchController {

	@Autowired
	TheMovieDbService tmdbs;
	@Autowired
	HttpSession session;
	
	@RequestMapping("searching")
	public ModelAndView shear(String searchType, String name, Integer year, String genre) {
		if (searchType.equals("name")) {
			TMDBServiceResponse response = tmdbs.searchMoviesByName(name);
			session.setAttribute("response", response);
			return new ModelAndView("searchmovie");
		}
		return null;
	}
	
	
	
}
