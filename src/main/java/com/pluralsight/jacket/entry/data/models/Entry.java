package com.pluralsight.jacket.entry.data.models;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "entries")
public class Entry extends BaseModel {

	private String url;

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
