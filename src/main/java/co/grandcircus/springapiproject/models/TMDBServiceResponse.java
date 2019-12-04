package co.grandcircus.springapiproject.models;

import java.util.List;

import org.springframework.stereotype.Component;

public class TMDBServiceResponse {
	
	private List<TMDBServiceResult> results;

	public TMDBServiceResponse(List<TMDBServiceResult> results) {
		super();
		this.results = results;
	}

	public TMDBServiceResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<TMDBServiceResult> getResults() {
		return results;
	}

	public void setResults(List<TMDBServiceResult> results) {
		this.results = results;
	}
}
