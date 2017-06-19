import java.util.Scanner;

public class PairProcess {
	public static void main(String[] args) {
		int num1, num2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "First Number? :" );
		num1 = keyboard.nextInt();
		
		System.out.print( "Last Number?  :" );
		num2 = keyboard.nextInt();
		
		System.out.print("Sum is: ");
		
		
		if(num1+num2 >200){
			System.out.print("*");
			
		}
		if(num1+num2<1000){
			System.out.print("~");
		}
		
		System.out.println(num1+num2 + "");
		System.out.println("Product is: " + num1*num2);
		System.out.println("average is: " + ((num1+num2)/2));
	}
}