import java.util.Scanner;
public class ShiftySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		/*
		 * Follow the instructions in Junior Problem 2.pdf.
		 * Use the following data to test your program and record your answers
		 * 1) 1,0 1
		 * 2) 1,3 1111
		 * 3) 99,4 1099989
		 * 4) 10000,5 1111110000
		 * 5) 9139,4 101543429
		 * 6) 9252,5 1027998972
		 * 7) 888,0 888
		 * 8) 4578,1 50358
		 * 9) 2746,2 304806
		 * 10) 6295,3 699374
		 * 11) 6884,4 76488124
		 * 12) 1198,5 133110978
		 * 13) 8655,0 8655
		 * 14) 2503,1 27533
		 * 15) 7868,2 873348
		 */
		 int N=in.nextInt();
		 //Number want to shift
		 int k=in.nextInt();
		 //How many times shifting
		 int answer=0;
		 while(k>0) {
			 answer=(int) (answer+N*Math.pow(10, k));
			 k=k-1;
		 }
		 System.out.println(answer+N);
	}

}
