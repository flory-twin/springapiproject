package co.grandcircus.springapiproject.models;

public class TMDBServiceResult {
	
	public static final String imageBaseUrl = "https://image.tmdb.org/t/p/w185_and_h278_bestv2/";
	
	private String id;
	private String title;
	private String overview;
	private String releaseDate;
	private String posterPath;
	
	public String getImageUrl() {
		return imageBaseUrl + posterPath;
	}
	
	
}
