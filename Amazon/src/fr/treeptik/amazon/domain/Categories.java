package fr.treeptik.amazon.domain;

import java.io.Serializable;

public class Categories implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Integer catId;
	private String catName;
	private String catUrl;
	public Categories(Integer catId, String catName, String catUrl) {
		super();
		this.catId = catId;
		this.catName = catName;
		this.catUrl = catUrl;
	}
	
	public Categories() {
		
	}

	public Integer getCatId() {
		return catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatUrl() {
		return catUrl;
	}

	public void setCatUrl(String catUrl) {
		this.catUrl = catUrl;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((catId == null) ? 0 : catId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categories other = (Categories) obj;
		if (catId == null) {
			if (other.catId != null)
				return false;
		} else if (!catId.equals(other.catId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Categories [catId=" + catId + ", catName=" + catName + ", catUrl=" + catUrl + "]";
	}

	

}
