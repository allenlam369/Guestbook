package test;

import java.util.Date;

public class GenNumbers {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 64; i++) {
			sb.append(i).append(' ');
		}
		System.out.println(sb.toString().trim());
		

	}

}
