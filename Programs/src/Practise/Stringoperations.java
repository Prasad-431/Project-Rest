package Practise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Stringoperations {
	public static void main(String args[])

	{
		int[] arr = { 3, 6, 4, 7,1, 2, 0, 4, 5 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int smin = Integer.MAX_VALUE;
		int smax = Integer.MIN_VALUE;
		for (int a : arr) {

			if (max < a) {
				smax = max;
				max = a;

			} else if (smax < a && max != a)
				smax = a;
			if (min > a) {
				smin = min;
				min = a;

			} else if (a < smin && a != smin)
				smin = a;

		}
		System.out.println("Max:" + max + " Min: " + min);
		System.out.println("Second Max:" + smax + " Second Min: " + smin);

	}

}