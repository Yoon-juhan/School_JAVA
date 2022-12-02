
public class Car {
	private String color;
	private int speed, gear;

	// 생성자, 이름은 클래스 이름과 같다.
	Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}
	public void print() {
		System.out.println("Color = " + color + "\nSpeed = " + speed + " km/h" + "\nGear = " + gear + " 단");
	}
	void changeGear(int g) {
		gear = g;
	}
	void speedUp() {
		speed += 10;
	}
	void speedDown() {
		if (speed >= 10) speed -= 10;
	}
	void setColor(String c) {
		color = c;
	}
}
