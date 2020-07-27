//Colin Morris-Moncada
//EGR 222
// Demonstrating the StructuredClass with static methods called in the main 

package java_basics;

public class StructuredClass {
	
	public static void main(String[] args) {
		drawDiamond();
		System.out.println();
		drawX();

	}

	public static void drawDiamond() {
		System.out.println("  /\\");
		System.out.println(" /  \\");
		System.out.println("/    \\");
		System.out.println("\\    /");
		System.out.println(" \\  /");
		System.out.println("  \\/");
		System.out.println("");
	}
	
	public static void drawX() {
		System.out.println("\\     /");
		System.out.println(" \\   /");
		System.out.println("  \\ /");
		System.out.println("  / \\");
		System.out.println(" /   \\");
		System.out.println("/     \\");	
	}
}
