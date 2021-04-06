package com.cg.fda;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Sample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer[] numbers = new Integer[8];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = in.nextInt();
			in.nextLine();
		}
		Stream<Integer> s = Stream.empty();
		s = Arrays.stream(numbers);
		s = s.sorted();
		Object[] numberSorted = s.toArray();
		System.out.println("Sorted numbers: ");
		for(int i=0;i<numberSorted.length;i++) {
			System.out.print((Integer) numberSorted[i]+" ");
		}

	}

}
