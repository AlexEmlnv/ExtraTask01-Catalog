package by.htp.catalog.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import by.htp.catalog.bean.NewsItem;
import by.htp.catalog.service.CatalogService;
import by.htp.catalog.service.ServiceFactory;

public class AppMain {

	public static void main(String[] args) {
		System.out.println("AppMain.main() : start");
		
		ServiceFactory factory = ServiceFactory.getInstance();
		
		CatalogService service = factory.getCatalogService();
		
		// Add first news
		NewsItem newsItem = new NewsItem();
		List<String> authors = new ArrayList<>();
		newsItem.setNewsName("Новый фильм Сталлоне");
		authors.add("Goga Kukhishvilli");
		authors.add("Billi Joel");
		newsItem.setAuthors(authors);
		newsItem.setDateOfIssue(new Date());
		newsItem.setNewsBody(" Огромный успех у нового фильма Сильвестра Сталлоне 'Скалолаз'! Поздравляем парня!!!!");
		
		String subcategoryName = "Action";
		String categoryName = "Films";
		service.addNewsItem(categoryName, subcategoryName, newsItem);
		
		// Add second news
		NewsItem newsItem2 = new NewsItem();
		List<String> authors2 = new ArrayList<>();
		newsItem2.setNewsName("Новый фильм Арни");
		authors2.add("John Bulba");
		authors2.add("Hose Kareras");
		newsItem2.setAuthors(authors);
		newsItem2.setDateOfIssue(new Date());
		newsItem2.setNewsBody("Огромный успех у нового фильма Арнольда Шварценеггера 'Терминатор2'! Поздравляем парня!!!!");
		
		String subcategoryName2 = "Action";
		String categoryName2 = "Films";
		service.addNewsItem(categoryName2, subcategoryName2, newsItem2);
		
		// Find news
//		service.FindNews(str);
		
		System.out.println("AppMain.main() : end");
			
	}

}
