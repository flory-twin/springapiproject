package co.grandcircus.springapiproject.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TMDBMovieProductionCompany {
	private Integer id;
	@JsonProperty("logo_path")
	private String logoPath;
	private String name;
	@JsonProperty("origin_country")
	private String originCountry;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogoPath() {
		return logoPath;
	}
	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOriginCountry() {
		return originCountry;
	}
	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}
	public TMDBMovieProductionCompany(Integer id, String logoPath, String name, String originCountry) {
		super();
		this.id = id;
		this.logoPath = logoPath;
		this.name = name;
		this.originCountry = originCountry;
	}
	public TMDBMovieProductionCompany() {
		super();
		// TODO Auto-generated constructor stub
	}
}
