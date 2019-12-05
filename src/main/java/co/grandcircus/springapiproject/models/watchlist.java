package co.grandcircus.springapiproject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "watchlist")
public class watchlist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String tmdbId;
	private String img;
	private String name;

	public watchlist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public watchlist(Integer id) {
		super();
		this.id = id;
	}

	public watchlist(String tmdbId, String img, String name) {
		super();
		this.tmdbId = tmdbId;
		this.img = img;
		this.name = name;
	}

	public watchlist(Integer id, String tmdbId, String img, String name) {
		super();
		this.id = id;
		this.tmdbId = tmdbId;
		this.img = img;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTmdbId() {
		return tmdbId;
	}

	public void setTmdbId(String tmdbId) {
		this.tmdbId = tmdbId;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "watchlist [id=" + id + ", tmdbId=" + tmdbId + ", img=" + img + ", name=" + name + "]";
	}

}
