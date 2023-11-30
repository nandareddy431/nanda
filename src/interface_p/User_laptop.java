package interface_p;

public class User_laptop {

	public static void main(String[] args) {
		Lenovo len=new Lenovo();
		len.copy();
		len.paste();
		
		Apple app= new Apple();
		app.cut();
		app.keyboard();
		
		Laptop.audio(); //static method directly calls without object creation
		
		
		

	}

}
