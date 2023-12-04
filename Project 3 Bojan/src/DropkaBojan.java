import java.util.Scanner;

public class DropkaBojan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);

	        System.out.println("Внесете броител:");
	        int broitel = input.nextInt();

	        System.out.println("Внесете именител:");
	        int imenitel = input.nextInt();

	        int gcd = findGCD(broitel, imenitel);
	        broitel /= gcd;
	        imenitel /= gcd;

	        System.out.println("Најмал заеднички делител: " + gcd);
	        System.out.println("Скратена дропка: " + broitel + "/" + imenitel);
	    }

	    public static int findGCD(int a, int b) {
	        if (b == 0) {
	            return a;
	        }
	        return findGCD(b, a % b);
	    }
	
	
	}


