package util;

public class Data {

	private String name;
	private int age;
	private float height;

	private double percentage = 0;
	private float averageHeight;
	private String namesUnder = "";

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
		averageHeight = 0;
		for (Data person : dataArray) {
			totalHeight += person.getHeight();
		}
		averageHeight = totalHeight / dataArray.length;
		return averageHeight;	
	}

	public double calcUnder16(Data[] dataArray){
		double totalPeople = 0;
		int peopleUnder = 0;

		for(Data person : dataArray)  {
			if (person.getAge() < 16) {
				peopleUnder++;
			}
			totalPeople++;
		}
		percentage = 100 / totalPeople * peopleUnder;
		return percentage;
	}
	
	public String namesUnderPick(Data[] dataArray) {
		for(Data person : dataArray) {
			if (person.getAge() < 16) {
				namesUnder += person.getName() + "\n";
			}
		}
		return namesUnder;
	}
	
	
	
	}



