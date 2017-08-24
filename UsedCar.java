
public class UsedCar extends Car {
	private int mileage;

	public UsedCar(double price, int mileage) {
		super(price);
		this.mileage = mileage;
	}

	public void display() {
		System.out.println("price = $" + getPrice() + " mileage = " + mileage);
	}

	public boolean equals(UsedCar usedCar2) {
		boolean objectsEqual;
		boolean condition1 = this.getPrice() == (usedCar2.getPrice());
		boolean condition2 = this.mileage == (usedCar2.mileage);
		if (condition1 && condition2) {
			objectsEqual = true;
		} else {
			objectsEqual = false;
		}
		return objectsEqual;
	}
}
