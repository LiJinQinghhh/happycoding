package JAVA8的新特性作业;

public class Apple {
	//定义一个苹果类，有颜色和重量两个属性
	private String color;
	private Float weight;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Float getWeight() {
		return weight;
	}
	public void setWeight(Float weight) {
		this.weight = weight;
	}
	public Apple(String color, Float weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + "]";
	}
	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
	}
}
