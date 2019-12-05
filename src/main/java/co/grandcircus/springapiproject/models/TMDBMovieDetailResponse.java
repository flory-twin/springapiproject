package co.grandcircus.springapiproject.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TMDBMovieDetailResponse {
	
	private String title, overview;
	private boolean adult;
	private List<TMDBServiceGenre> genres;
	@JsonProperty("poster_path")
	private String posterPath;
	@JsonProperty("production_companies")
	private List<TMDBMovieProductionCompany> productionCompany;
	@JsonProperty("release_date")
	private String releaseDate;
	
	public TMDBMovieDetailResponse(String title, String overview, boolean adult, List<TMDBServiceGenre> genres,
			String posterPath, List<TMDBMovieProductionCompany> productionCompany, String releaseDate) {
		super();
		this.title = title;
		this.overview = overview;
		this.adult = adult;
		this.genres = genres;
		this.posterPath = posterPath;
		this.productionCompany = productionCompany;
		this.releaseDate = releaseDate;
	}
	public TMDBMovieDetailResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public boolean isAdult() {
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	public List<TMDBServiceGenre> getGenres() {
		return genres;
	}
	public void setGenres(List<TMDBServiceGenre> genres) {
		this.genres = genres;
	}
	public String getPosterPath() {
		return posterPath;
	}
	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}
	public List<TMDBMovieProductionCompany> getProductionCompany() {
		return productionCompany;
	}
	public void setProductionCompany(List<TMDBMovieProductionCompany> productionCompany) {
		this.productionCompany = productionCompany;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	
	
}
