package by.htp.catalog.dao.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import by.htp.catalog.bean.Catalog;
import by.htp.catalog.bean.NewsItem;
import by.htp.catalog.dao.CatalogDaoService;

public class CatalogDaoServiceImpl implements CatalogDaoService {
	
	private static final String CATALOG_FILE_NAME = "D:\\catalog.xml"; 
	
	@Override
	public void addNewsItem(String categoryName, String subcategoryName, NewsItem newNewsItem) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<NewsItem> FindNews(String str) {
		// TODO Auto-generated method stub
		return null;
	}
   
	private Catalog readCatalog() {
		// TODO Auto-generated method stub
		Catalog catalog = null;
		JAXBContext context;
		
		try {
			context = JAXBContext.newInstance(Catalog.class);
			Unmarshaller u = context.createUnmarshaller();
			File file = new File(CATALOG_FILE_NAME);
			if (!file.exists()) return null;
			
			catalog = (Catalog) u.unmarshal(file);
		} catch (JAXBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return catalog;
	}

	public void writeCatalog(Catalog catalog) {
		System.out.println("CatalogDaoImpl.writeCatalog : start");
		System.out.println("CatalogDaoImpl.writeCatalog : " + catalog);
		
		JAXBContext context;
		
		try {
			context = JAXBContext.newInstance(Catalog.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(catalog, new FileOutputStream(CATALOG_FILE_NAME));
		
		} catch (JAXBException | FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("CatalogDaoImpl.writeCatalog : end");
	}
	
}
