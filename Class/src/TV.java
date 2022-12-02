
public class TV {
	private String company;
	private int year, inch;
	
	TV(String c, int y, int i) {
		company = c;
		year = y;
		inch = i;
	}
	void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV", company, year, inch);
	}
}
