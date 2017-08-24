
public class NewCar extends Car {
	private String color;

	public NewCar(double price, String color) {
		super(price);
		this.color = color;
	}

	public void display() {
		System.out.println("price = $" + getPrice() + " color = " + color);
	}

	public boolean equals(NewCar newCar2) {
		boolean objectsEqual;
		boolean condition1 = this.getPrice() == (newCar2.getPrice());
		boolean condition2 = this.color == (newCar2.color);
		if (condition1 && condition2) {
			objectsEqual = true;
		} else {
			objectsEqual = false;
		}
		return objectsEqual;
	}
}
