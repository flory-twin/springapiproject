package co.grandcircus.springapiproject.models;

public class FavPage {

	private Integer idfav;
	private String favname;
	private String favimg;

	public FavPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FavPage(Integer idfav) {
		super();
		this.idfav = idfav;
	}

	public FavPage(Integer idfav, String favname, String favimg) {
		super();
		this.idfav = idfav;
		this.favname = favname;
		this.favimg = favimg;
	}

	public Integer getIdfav() {
		return idfav;
	}

	public void setIdfav(Integer idfav) {
		this.idfav = idfav;
	}

	public String getFavname() {
		return favname;
	}

	public void setFavname(String favname) {
		this.favname = favname;
	}

	public String getFavimg() {
		return favimg;
	}

	public void setFavimg(String favimg) {
		this.favimg = favimg;
	}

	@Override
	public String toString() {
		return "FavPage [idfav=" + idfav + ", favname=" + favname + ", favimg=" + favimg + "]";
	}

}
