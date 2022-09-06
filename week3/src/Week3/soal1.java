package Week3;

import java.util.Scanner;

public class soal1 {

	public static void main(String[] args) {
		String s;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan Kata : ");
		s = input.nextLine();
		
		String[] arrStr = s.split("[! , . ? _ ' @]+");
		
		int n = arrStr.length;
		System.out.println(n);
		for(int i=0; i<n; i++) {
			System.out.println(arrStr[i]);
		}
	}
}
