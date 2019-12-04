package co.grandcircus.springapiproject.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class watchlist {

	@Id
	private String id;
	private String img;

	public watchlist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public watchlist(String id) {
		super();
		this.id = id;
	}

	public watchlist(String id, String img) {
		super();
		this.id = id;
		this.img = img;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}
