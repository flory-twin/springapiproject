package co.grandcircus.springapiproject.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TMDBServiceResult {

	public static final String imageBaseUrl = "https://image.tmdb.org/t/p/w185_and_h278_bestv2/";

	private String id;
	private String title;
	@JsonProperty("genre_ids")
	private List<Integer> genreIds;
	private String overview;
	@JsonProperty("release_date")
	private String releaseDate;
	@JsonProperty("poster_path")
	private String posterPath;

	public String getImageUrl() {
		return imageBaseUrl + posterPath;
	}

	public TMDBServiceResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TMDBServiceResult(String id, String title, List<Integer> genreIds, String overview, String releaseDate,
			String posterPath) {
		super();
		this.id = id;
		this.title = title;
		this.genreIds = genreIds;
		this.overview = overview;
		this.releaseDate = releaseDate;
		this.posterPath = posterPath;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Integer> getGenreIds() {
		return genreIds;
	}

	public void setGenreIds(List<Integer> genreIds) {
		this.genreIds = genreIds;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}

}
