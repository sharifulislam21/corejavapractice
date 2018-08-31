package com.shariful.aug1.interviewprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharInString {

	public static void main(String[] args) {
		DuplicateCharInString dcs = new DuplicateCharInString();
		dcs.findDuplicateCharInString("bookkeeper");
	}

	private void findDuplicateCharInString(String string) {

		Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
		char[] charArr = string.toCharArray();
		for (Character ch : charArr) {
			if (dupMap.containsKey(ch))
				dupMap.put(ch, dupMap.get(ch) + 1);
			else
				dupMap.put(ch, 1);
		}

		//Set<Character> keys = dupMap.keySet();
		// for(Character ch:keys){
		// if(dupMap.get(ch)>1)
		// System.out.println(ch+" -> "+dupMap.get(ch));
		// }

		for (Entry<Character, Integer> entry : dupMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey()+"->"+entry.getValue());
			}
		}
	}
}
