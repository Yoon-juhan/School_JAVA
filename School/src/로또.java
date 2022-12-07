import java.util.*;

public class 로또 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] lotto = new int[6];
		int[] freq = new int[46];
		
		System.out.println("===== 로또 복권번호 생성 =====");
		
		for (int i = 0; i < 6; i++) {
			lotto[i] = rnd.nextInt(45)+1;
			
			if (freq[lotto[i]] == 1) {
				i--;
			} else {
				freq[lotto[i]] = 1;
			}
		}
		for (int i : lotto) {
			System.out.print(i + " ");
		}
		
		if (args.length > 0) {
			for (String i : args) {
				System.out.println(i + " ");
			}
		}
	}
}