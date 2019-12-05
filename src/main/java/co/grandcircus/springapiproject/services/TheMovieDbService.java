package co.grandcircus.springapiproject.services;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.springapiproject.models.TMDBMovieDetailResponse;
import co.grandcircus.springapiproject.models.TMDBServiceGenreResponse;
import co.grandcircus.springapiproject.models.TMDBServiceResponse;

@Component
public class TheMovieDbService {

	RestTemplate rt = new RestTemplate();
	
	public static final String baseUrl = "https://api.themoviedb.org/3";
	public static final String discoverResource = "/search/movie";
	public static final String baseGenreUrl = baseUrl + "/genre/movie/list";
	public static final String movieDetailResource = "/movie";
	
	@Value("${moviedb.key}")
	private String apiKey;
	
	private HashMap<String, String> getParamsWithApiKey() {
		HashMap<String, String> params = new HashMap<>();
		params.put("api_key", apiKey);
		
		return params;
	}
	
	public TMDBServiceResponse searchMoviesByName(String name) {
		HashMap<String, String> params = getParamsWithApiKey();
		params.put("query", name);
		
		String url = baseUrl + discoverResource + "?api_key=" + apiKey + "&query=" + name;
		TMDBServiceResponse response = rt.getForObject(url, TMDBServiceResponse.class);
		//HttpEntity<TMDBServiceResponse> resp = rt.exchange(baseUrl + discoverResource, HttpMethod.GET, 
		//		new HttpEntity<String>("parameters", params), TMDBServiceResponse.class);
		//TMDBServiceResponse response = rt.getForObject(baseUrl + discoverResource, TMDBServiceResponse.class, params);
		
		return response;
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
	
	public TMDBMovieDetailResponse getMovieDetails(String id) {
		String url = baseUrl + movieDetailResource + "/" + id + "?api_key=" + apiKey + "&query=" + id;
		TMDBMovieDetailResponse response = rt.getForObject(url, TMDBMovieDetailResponse.class);
		//HttpEntity<TMDBServiceResponse> resp = rt.exchange(baseUrl + discoverResource, HttpMethod.GET, 
		//		new HttpEntity<String>("parameters", params), TMDBServiceResponse.class);
		//TMDBServiceResponse response = rt.getForObject(baseUrl + discoverResource, TMDBServiceResponse.class, params);
		
		return response;
	}
}
