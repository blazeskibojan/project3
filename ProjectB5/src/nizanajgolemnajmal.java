import java.util.Scanner;

public class nizanajgolemnajmal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Внесете големина на низата: ");
        int n = input.nextInt();
        int[] array = new int[n];

        System.out.println("Внесете ги елементите на низата:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        if (n == 0) {
            System.out.println("Низата е празна.");
        } else {
        	   int min = array[0];
               int max = array[0];

               for (int i = 1; i < n; i++) {
                   if (array[i] < min) {
                       min = array[i];
                   }
                   if (array[i] > max) {
                       max = array[i];
                   }
               }

               System.out.println("Најмалиот елемент во низата е: " + min);
               System.out.println("Најголемиот елемент во низата е: " + max);
        }
	}

}
