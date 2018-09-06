package by.htp.catalog.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "newsItem", propOrder = { "newsName", "authors", "dateOfIssue", "newsBody"})
public class NewsItem {
	
	@XmlElement(required = true)
	public String newsName;
	
	@XmlElementWrapper(name = "provider")
	@XmlElement(name = "author", required = true)
	public List<String> authors = new ArrayList<>();
	
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	public Date dateOfIssue;
	
	@XmlElement(required = true)
	public String newsBody;

	public String getNewsName() {
		return newsName;
	}

	public void setNewsName(String newsName) {
		this.newsName = newsName;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public String getNewsBody() {
		return newsBody;
	}

	public void setNewsBody(String newsBody) {
		this.newsBody = newsBody;
	}

	@Override
	public String toString() {
		return "NewsItem [newsName=" + newsName + ", authors=" + authors + ", dateOfIssue=" + dateOfIssue
				+ ", newsBody=" + newsBody + "]";
	}

	
	
}
