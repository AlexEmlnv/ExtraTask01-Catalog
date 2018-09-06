package by.htp.catalog.dao;

import java.util.List;

import by.htp.catalog.bean.NewsItem;

public interface CatalogDaoService {
	
	public void addNewsItem (String categoryName, String subcategoryName, NewsItem newNewsItem) throws DaoException;
	
	public List<NewsItem> FindNews(String str) throws DaoException;

//    Catalog readCatalog() throws DaoException;
//    void writeCatalog(Catalog catalog) throws DaoException;
}
