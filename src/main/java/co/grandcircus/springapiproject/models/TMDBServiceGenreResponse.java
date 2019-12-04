package co.grandcircus.springapiproject.models;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

public class TMDBServiceGenreResponse {
	
	List<TMDBServiceGenre> genres;

	public List<TMDBServiceGenre> getGenres() {
		return genres;
	}

	public void setGenres(List<TMDBServiceGenre> genres) {
		this.genres = genres;
	}

	public TMDBServiceGenreResponse(List<TMDBServiceGenre> genres) {
		super();
		this.genres = genres;
	}

	public TMDBServiceGenreResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
}
