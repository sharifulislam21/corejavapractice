package com.shariful.aug1.interviewprograms;

public class FindMissingNumberFromAP {

	public static void main(String[] args) {
		int[] arrNum = { 2, 4, 8, 10, 12, 14 };
		int length = arrNum.length;
		int missingNum = getMissingNumberFromAP(arrNum, length);
		System.out.println("Missing Number:" + missingNum);
	}

	private static int getMissingNumberFromAP(int[] arrNum, int length) {

		int difference = (arrNum[length - 1] - arrNum[0]) / length;

		return findMissing(arrNum, 0, length - 1, difference);
	}

	private static int findMissing(int[] arrNum, int low, int high,
			int difference) {

		if (high <= low) {
			return Integer.MAX_VALUE;
		}

		int mid = low + (high - low) / 2;

		if (arrNum[mid + 1] - arrNum[mid] != difference)
			return (arrNum[mid] + difference);

		if (mid > 0 && arrNum[mid] - arrNum[mid - 1] != difference)
			return (arrNum[mid - 1] + difference);

		if (arrNum[mid] == arrNum[0] + mid * difference)
			return findMissing(arrNum, mid + 1, high, difference);

		return findMissing(arrNum, low, mid - 1, difference);
	}
}
