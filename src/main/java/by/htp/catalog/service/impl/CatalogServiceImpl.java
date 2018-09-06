package by.htp.catalog.service.impl;

import java.util.ArrayList;
import java.util.List;

import by.htp.catalog.bean.Catalog;
import by.htp.catalog.bean.Category;
import by.htp.catalog.bean.NewsItem;
import by.htp.catalog.bean.SubCategory;
import by.htp.catalog.dao.DaoException;
import by.htp.catalog.dao.impl.CatalogDaoServiceImpl;
import by.htp.catalog.service.CatalogService;

public class CatalogServiceImpl implements CatalogService {

	@Override
	public void addNewsItem(String categoryName, String subCategoryName, NewsItem newNewsItem) {
		
		
		System.out.println("CatalogServiceImpl.addNewsItem() : start ");
		// get 
		CatalogDaoServiceImpl catalogDao = new CatalogDaoServiceImpl();
		Catalog catalog = new Catalog();
		try {
			catalog = catalogDao.readCatalog();
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (catalog == null) {
			catalog = new Catalog();
			System.out.println("Создаем каталог с нуля!");
			List<NewsItem> news = new ArrayList<>();
			news.add(newNewsItem);
			
			SubCategory subCategory = new SubCategory();
			subCategory.setName(subCategoryName);
			subCategory.setNews(news);
			
			List<SubCategory> subCategories = new ArrayList<>();
			subCategories.add(subCategory);
			
			Category category = new Category();
			category.setName(categoryName);
			category.setSubCategories(subCategories);
			
			List<Category> categories = new ArrayList<>();
			categories.add(category);
			
			System.out.println(news);
			System.out.println(subCategories);
			System.out.println(categories);
			catalog.setCategories(categories);
			System.out.println(catalog);
			
			
		} else {
			System.out.println("Добавили новую запись!");
//			for (Category category : catalog.getCategories()) {
//				
//			}	
		}
		
		catalogDao.writeCatalog(catalog);
		
		System.out.println("CatalogServiceImpl.addNewsItem() : end");
	}

	@Override
	public List<NewsItem> FindNews(String str) {
		// TODO Auto-generated method stub
		return null;
	}

}
