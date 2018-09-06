package by.htp.catalog.bean;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name= "catalog")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "categories"})
public class Catalog {
	
	@XmlElement(name = "category", required = true)
	public List<Category> categories = new ArrayList<>();

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Catalog [categories=" + categories + "]";
	}

}
