package dailyWork1;

import java.util.ArrayList;

public class BookService {

	private BookDAO dao;
	private String keyword;
	
	public BookService(){
		//Default Constructor는 무조건만드셈
	}
	public BookService(BookDAO dao){
		this.dao = dao;
	}
	public BookDAO getDao() {
		return dao;
	}

	public void setDao(BookDAO dao) {
		this.dao = dao;
	}
	
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public ArrayList<BookEntity> getListByKeyword() {
		//DAO생성->X ;; 
		//DAO매소드호출 ==> 결과받아서 return
				
		return dao.selectAll(keyword);
	}
	
}