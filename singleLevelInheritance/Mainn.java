class Animal{
	int x = 1;
	
}
class Dog extends Animal{
	int y = x;
	public void Details(){
		System.out.println("y is :"+y +"   x is: "+x);
	}

}
public class Mainn{
public static void main(String[] args) {
    Dog d1 = new Dog();
    d1.Details();
    
}
}
