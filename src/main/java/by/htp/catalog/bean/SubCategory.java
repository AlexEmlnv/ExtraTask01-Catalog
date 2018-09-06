package by.htp.catalog.bean;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "news" })
public class SubCategory {
	
	@XmlAttribute(name = "name", required = true)
	public String name;
	
	@XmlElement(name = "news", required = true)
	public List<NewsItem> news = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<NewsItem> getNews() {
		return news;
	}

	public void setNews(List<NewsItem> news) {
		this.news = news;
	}

	@Override
	public String toString() {
		return "SubCategory [name=" + name + ", news=" + news + "]";
	}
	
	

}
