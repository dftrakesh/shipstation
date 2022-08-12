package io.github.dftrakesh.shipstation.accounts;

public class Tags {
	private Integer tagId;
	private String name;
	private String color;
	public Integer getTagId() {
		return tagId;
	}
	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Tags [tagId=" + tagId + ", name=" + name + ", color=" + color + "]";
	}
	
}
