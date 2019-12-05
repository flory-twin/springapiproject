package co.grandcircus.springapiproject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.springapiproject.jpaRepos.WatchListRepos;
import co.grandcircus.springapiproject.models.TMDBServiceResponse;
import co.grandcircus.springapiproject.models.TMDBServiceResult;
import co.grandcircus.springapiproject.models.watchlist;
import co.grandcircus.springapiproject.services.TheMovieDbService;

@Controller
public class SearchController {

	@Autowired
	WatchListRepos wR;
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
	
	
//	@RequestMapping("add-watchlist")
//	public ModelAndView addTeamName(watchlist w) {
//		wR.save(w);
//		return new ModelAndView("redirect:/searchmovie");
//	}

	@RequestMapping("add-watchlist")
	public ModelAndView addTeamName(String id) {
		
		TMDBServiceResult toBeAdded = null;
		for (TMDBServiceResult tsr : ((TMDBServiceResponse) session.getAttribute("response")).getResults()) {
			if (tsr.getId().equals(id)) {
				toBeAdded = tsr;
			}
		}
				
		wR.save(new watchlist(toBeAdded.getId(), toBeAdded.getImageUrl(), toBeAdded.getTitle()));
		
		return new ModelAndView("redirect:/searchmovie");
	}
	
}
