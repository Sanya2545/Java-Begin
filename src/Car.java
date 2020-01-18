import java.util.Comparator;

public class Car implements ShowInfo{

	private String name;
	private String color;
	private double price;
	private Engine engine;

	public Car(String name, String color, double price, Engine engine) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.engine = engine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void Show() {
		System.out.printf("Name: s%\tColor%s\tPrice: %f\n", name, color, price);
		
	}
}

class SortbyPrice implements Comparator<Car>
{
	
	@Override
	public int compare(Car a, Car b) {
		double price = a.getPrice() - b.getPrice();
		return (int)price;
	}
	
}
