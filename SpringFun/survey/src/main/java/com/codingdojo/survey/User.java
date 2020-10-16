package com.codingdojo.survey;

public class User {
	public String name;
	public String location;
	public String langauge;
	public String comment;
	public User(String name, String location, String langauge, String comment) {
		super();
		this.name = name;
		this.location = location;
		this.langauge = langauge;
		this.comment = comment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLangauge() {
		return langauge;
	}
	public void setLangauge(String langauge) {
		this.langauge = langauge;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
