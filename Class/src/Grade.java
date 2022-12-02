
public class Grade {
	private int math, science, english;
	Grade (int m, int s, int e) {
		math = m;
		science = s;
		english = e;
	}
	int average() {
		return (math + science + english) / 3;
	}
}
