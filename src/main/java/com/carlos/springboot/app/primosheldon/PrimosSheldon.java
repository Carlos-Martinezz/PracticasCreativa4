package com.carlos.springboot.app.primosheldon;

/**
 * @author Carlos Martínez
 *
 */
public class PrimosSheldon {

	public static boolean primo(StringBuffer dcba, StringBuffer zyx) {

		boolean isOK = false;
		int numPrimos = 0;
		int num;
		int num1;
		int num2 = 0;
		int numinter;

		for (numinter = 1;; numinter++) {
			num = numinter;

			for (num1 = 1; num1 <= num; num1++) {
				if (num % num1 == 0) {
					num2 = num2 + 1;
				}
			}

			if (num2 == 2) {
				numPrimos += 1;
				if (numPrimos == Integer.parseInt(zyx.toString()) && numinter == Integer.parseInt(dcba.toString())) {
					isOK = true;
					break;
				}
			} else if (numinter > Integer.parseInt(dcba.toString())) {
				break;
			}

			num2 = 0;
		}

		return isOK;
	}

}
