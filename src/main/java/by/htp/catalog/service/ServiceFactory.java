package by.htp.catalog.service;

import by.htp.catalog.dao.CatalogDaoService;
import by.htp.catalog.dao.impl.CatalogDaoServiceImpl;
import by.htp.catalog.service.impl.CatalogServiceImpl;

public class ServiceFactory {
	
	private static final ServiceFactory instance = new ServiceFactory();

	private final CatalogService catalogService = new CatalogServiceImpl();
	
	private final CatalogDaoService catalogDaoService = new CatalogDaoServiceImpl();
	
	private ServiceFactory() {
		
	}
	
	public static ServiceFactory getInstance() {
		return instance;
	}

	public CatalogService getCatalogService() {
		return catalogService;
	}

	public CatalogDaoService getCatalogDaoService() {
		return catalogDaoService;
	}

	
	
}
