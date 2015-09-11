package controllingexecution;

import static net.mindview.util.Print.*;

public class Exercise4 {

	public static void main(String[] args) {
		int total_count = 0;
		for (int i = 2; i < 1000; i++) {
			for (int j = 2; j <= i; j++) {
				if ((i != j) && (i % j == 0)) {
					break;
				}
				if (j == i) {
					print(i);
					total_count++;
				}
			}

		}
		print("Total number of Prime numbers between 1-100:"+total_count);
	}

}
