package by.htp.catalog.service;

import java.util.List;

import by.htp.catalog.bean.NewsItem;

public interface CatalogService {
	
	public void addNewsItem (String categoryName, String subcategoryName, NewsItem newNewsItem);
	
	public List<NewsItem> FindNews(String str);

}