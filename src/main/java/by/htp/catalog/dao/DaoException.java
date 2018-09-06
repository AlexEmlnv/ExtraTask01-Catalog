package by.htp.catalog.dao;

public class DaoException extends Exception {

	private static final long serialVersionUID = 6597631899994266436L;
	
	public DaoException() {
	}
	
	public DaoException(String message) {
	    super(message);
	}
	
	public DaoException(String message, Exception e) {
	    super(message, e);
	}
	
	public DaoException(Exception e) {
	    super(e);
	}
}
