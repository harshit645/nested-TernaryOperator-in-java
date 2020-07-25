package conditionalStatments;
import java.util.Scanner;

public class Nestedternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		System.out.println("Enter the value of c");
		int c=sc.nextInt();
		
		//Greater of 3 numbers(a,b,c) program using nested ternary operator
		
		int maxof3numbers=a>b?a>c?a:c:b>c?b:c;
		
		System.out.println("greater of 3 number is "+maxof3numbers);
		
	}

}
