package co.grandcircus.springapiproject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.springapiproject.jpaRepos.WatchListRepos;
import co.grandcircus.springapiproject.services.TheMovieDbService;

@Controller
public class HomeController {

	@Autowired
	TheMovieDbService tmdbs;
	@Autowired
	HttpSession session;
	@Autowired
	WatchListRepos wR;
	
	@RequestMapping("/")
	public ModelAndView home() {
		session.setAttribute("wR", wR);
		return new ModelAndView("index");
	}

	@RequestMapping("/details/movie")
	public ModelAndView movieDeets2(String id) {
		return new ModelAndView("moviedeets", "details", tmdbs.getMovieDetails(id.toString()));
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
