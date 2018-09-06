package by.htp.catalog.service.impl;

import java.util.ArrayList;
import java.util.List;

import by.htp.catalog.bean.NewsItem;
import by.htp.catalog.dao.CatalogDaoService;
import by.htp.catalog.dao.DaoException;
import by.htp.catalog.dao.DaoFactory;
import by.htp.catalog.service.CatalogService;

public class CatalogServiceImpl implements CatalogService {

	@Override
	public void addNewsItem(String categoryName, String subCategoryName, NewsItem newNewsItem) {
		System.out.println("CatalogServiceImpl.addNewsItem() : start ");
		
		DaoFactory factory = DaoFactory.getInstance();
		CatalogDaoService catalogDao = factory.getCatalogDao();
		
		try {
				catalogDao.addNewsItem(categoryName, subCategoryName, newNewsItem);
		} catch (DaoException e) {
				e.printStackTrace();
		}
		
		System.out.println("CatalogServiceImpl.addNewsItem() : end");
	}

	@Override
	public List<NewsItem> FindNews(String str) {
		
		DaoFactory factory = DaoFactory.getInstance();
		CatalogDaoService catalogDao = factory.getCatalogDao();
		
		List<NewsItem> resList = new ArrayList<>();
		try {
			resList = catalogDao.FindNews(str) ;
		} catch (DaoException e) {
				e.printStackTrace();
		}
		return resList;
	}

}
