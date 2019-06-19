package fruit;

public abstract class fruit {
	String name;
	double price;
	public fruit(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public void show(){
		System.out.println("name:"+name+"\n"+"price:"+price);
	}

	public abstract void eat() ;

}
