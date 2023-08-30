package util;

public class Data {

	private String name;
	private int age;
	private float height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	public Data(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public Data() {

	}
	public float average_height(Data[] dataArray) {
		float totalHeight = 0;
		
		for (Data person : dataArray) {
			totalHeight += person.getHeight();
		}
		return totalHeight / dataArray.length;
		
	}
}
