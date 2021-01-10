package test;

public class Animal {
	
	//宣告實體變數
	private int age;
	private float weight; 
	private int color;
	
	
	
	
	//建構子
	public Animal(int age,float weight) {
		
		this.age=age;
		this.weight=weight;
		
				
	}
		
	public Animal() {
		//留著無參數的建構子：
		//1.增加繼承設計上的彈性
		//2.給工具，框架呼叫使用(最主要原因)
		
	}

	public void speak() {
		
		System.out.println("Age is="+ age);
		System.out.println("weight is =" +weight);
	}
	
	
	
	public int getAge() {
		
		return age;
	}
	
	public void setAge(int age) {
		
		this.age=age;
	}
	
	
	public float getWeight() {
		
		return weight;
	}
	
	public void setWeight(float weight) {
		
		this.weight =weight;
	}
	
	
}
