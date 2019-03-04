import java.util.Scanner;
public class Telemarketer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Follow the instructions in JuniorProblem.pdf
		 * Use the following values to test your program and record your results
		 * 1) 8,6,6,7 answer
		 * 2) 7,6,6,8 answer
		 * 3) 9,5,6,9 answer
		 * 4) 3,4,5,6 answer
		 * 5) 0,8,8,0 answer
		 * 6) 8,5,5,9 ignore
		 * 7) 9,1,1,9 ignore
		 * 8) 9,9,9,9 ignore
		 * 9) 9,1,2,8 answer
		 * 10) 8,7,4,8 answer 
		 * 11) 8,2,2,7 answer
		 * 12) 1,3,3,9 answer
		 * 13) 1,0,2,6 answer
		 */
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int d=in.nextInt();
		
		if ((a==9||a==8)&&(d==9||d==8)&&(b==c)){
			System.out.println("ignore");
		}else{
			System.out.println("answer");
		}
	}

}
