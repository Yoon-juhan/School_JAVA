
public class Test {

	public static void main(String[] args) {
		
		String str = new String("Hello World!");
		
		System.out.println(str.charAt(6));
		System.out.println(str.charAt(11));
		System.out.println(str.equals("Hello World!"));
		System.out.println(str.compareTo("hello World!"));
		System.out.println(str.concat("Aello"));
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		System.out.println(str.equalsIgnoreCase("hello world!"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
	}
}
