package co.grandcircus.springapiproject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TMDBServiceGenre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer databaseId;
	
	private Integer id;
	private String name;
	public TMDBServiceGenre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TMDBServiceGenre(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public TMDBServiceGenre(Integer databaseId, Integer id, String name) {
		super();
		this.databaseId = databaseId;
		this.id = id;
		this.name = name;
	}
	public Integer getDatabaseId() {
		return databaseId;
	}
	public void setDatabaseId(Integer databaseId) {
		this.databaseId = databaseId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
