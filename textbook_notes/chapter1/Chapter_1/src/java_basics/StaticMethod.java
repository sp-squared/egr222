//Colin Morris-Moncada
//EGR 222
// Using a Static Method(Function) and calling it in the main method
// Demonstrates the different FLOW OF CONTROL a program can have
package java_basics;


public class StaticMethod {
	
	public static void DrawBox() {
		
		System.out.println("+------+");
		System.out.println("|      |");
		System.out.println("|      |");
		System.out.println("+------+");
	}
	
	

	public static void main(String[] args) {
		DrawBox();

	}

}
