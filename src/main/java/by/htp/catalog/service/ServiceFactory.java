package by.htp.catalog.service;

import by.htp.catalog.service.impl.CatalogServiceImpl;

public class ServiceFactory {
	
	private static final ServiceFactory instance = new ServiceFactory();

	private final CatalogService catalogService = new CatalogServiceImpl();
	
	private ServiceFactory() {
		
	}
	
	public static ServiceFactory getInstance() {
		return instance;
	}

	public CatalogService getCatalogService() {
		return catalogService;
	}

	
}
