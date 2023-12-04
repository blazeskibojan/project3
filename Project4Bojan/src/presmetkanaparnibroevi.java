import java.util.Scanner;

public class presmetkanaparnibroevi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  Scanner tastatura = new Scanner(System.in);
		        System.out.print("Внесете должина: ");
		        int n = tastatura.nextInt();
		        int sum = 0;
		        for (int i = 0; i <= n; i += 2) {
		            sum += i;
		        }

		        System.out.println("Сумата на парните броеви до " + n + " е: " + sum);
	}

}
