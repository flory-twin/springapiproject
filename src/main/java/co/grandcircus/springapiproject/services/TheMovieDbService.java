package co.grandcircus.springapiproject.services;

import co.grandcircus.springapiproject.models.TMDBServiceGenreResponse;
import co.grandcircus.springapiproject.models.TMDBServiceResponse;

public class TheMovieDbService {

	public static final String baseUrl = "https://api.themoviedb.org/3/";
	public static final String discoverResource = "/discover/movie";
	public static final String baseGenreUrl = baseUrl + "genre/movie/list";
	
	public TMDBServiceResponse searchMoviesByName(String name) {
		return null;
	}
	
	public TMDBServiceResponse searchMoviesByYear(Integer year) {
		return null;
	}
	
	public TMDBServiceResponse searchMoviesByGenre(String genre) {
		return null;
	}
	
	public TMDBServiceGenreResponse getGenresFromTMDB() {
		// Note: query parameters are API key (as usual) and language=en-US
		return null;
	}
}
