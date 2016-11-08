package dailyWork1;

import java.util.ArrayList;

public class BookEntity {

	private String bisbn;
	private String btitle;
	private String bauthor;
	private ArrayList<String> ctext;
	
	
	public BookEntity(){
		
	}

	public String getBisbn() {
		return bisbn;
	}

	public void setBisbn(String bisbn) {
		this.bisbn = bisbn;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	
	public void getCtext() {
		int i=0;
		for(String s : ctext){
			System.out.println("=====>"+ ctext.get(i++));
			
		}
		
	}

	public void setCtext(ArrayList<String> ctext) {
		this.ctext = ctext;
	}

}