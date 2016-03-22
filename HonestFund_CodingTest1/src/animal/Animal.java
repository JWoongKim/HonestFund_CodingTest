package animal;

public class Animal {
	public void cry(){

	}
	public Animal dogCry(){
		System.out.println("멍멍");
		return dogCry();
	}
}
