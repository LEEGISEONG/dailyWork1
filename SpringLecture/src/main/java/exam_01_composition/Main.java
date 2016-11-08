package exam_01_composition;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//입력받고
		Scanner s = new Scanner(System.in);
		System.out.print("검색할 키워드 : ");
		String keyword = s.nextLine();
		
		//로직처리
		//로직 처리를 위한 service객체를 생성
		BookService service = new BookService();
		
		//서비스를 이용해서 business logic을 수행
		ArrayList<BookEntity> list = service.getListByKeyword(keyword);
		
		for(BookEntity entity : list){
			System.out.println(entity.getBtitle() + " : " + entity.getBauthor());
			
		}
		s.close();
	}

}



