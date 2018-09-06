package by.htp.catalog.dao;

import by.htp.catalog.dao.impl.CatalogDaoServiceImpl;

public class DaoFactory {
	private static final DaoFactory instance = new DaoFactory();

	private final CatalogDaoService catalogDao = new CatalogDaoServiceImpl();

	public CatalogDaoService getCatalogDao() {
		return catalogDao;
	}

	private DaoFactory() {
	}

	public static DaoFactory getInstance() {
		return instance;
	}

}
