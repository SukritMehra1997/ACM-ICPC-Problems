import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, i=0, ascii;
		String in;
		System.out.println(factorial(18));
		input = Integer.parseInt(sc.nextLine());
		while(i<input){
			ArrayList<Integer> numbers = new ArrayList<Integer>(Collections.nCopies(26, 0));
			in = sc.nextLine();
			for(int j=0;j<in.length();j++){
				ascii = in.charAt(j)-'A';
				numbers.set(ascii, numbers.get(ascii)+1);
			}
			long total = factorial(in.length());
			for(int j=0;j<26;j++){
				if(numbers.get(j)>1){
					total/=factorial(numbers.get(j));
				}
			}
			System.out.println("Data set "+(i+1)+": "+total);
			i++;
		}
		sc.close();
	}
	
	public static long factorial(int n){
		if (n==1 || n==0)
			return 1;
		else 
			return factorial(n-1) * n;
	}
}