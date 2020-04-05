package com.google.anil;

import java.util.HashMap;

public class Solution {
	
	static String convert(String input) {
		
		HashMap<Character,String> hm = new HashMap<Character,String>();
		hm.put('a',"100000");
		hm.put('b',"110000");
		hm.put('c',"100100");
		hm.put('d',"100110");
		hm.put('e',"100010");
		hm.put('f',"110100");
		hm.put('g',"110110");
		hm.put('h',"110010");
		hm.put('i',"010100");
		hm.put('j',"010110");
		hm.put('k',"101000");
		hm.put('l',"111000");
		hm.put('m',"101100");
		hm.put('n',"101110");
		hm.put('o',"101010");
		hm.put('p',"111100");
		hm.put('q',"111110");
		hm.put('r',"111010");
		hm.put('s',"011100");
		hm.put('t',"011110");
		hm.put('u',"101001");
		hm.put('v',"111001");
		hm.put('x',"101101");
		hm.put('y',"101111");
		hm.put('z',"101011");
		hm.put(' ',"000000");
		
		StringBuilder n = new StringBuilder();
		for (int i=0;i<input.length();i++) {
			if(Character.isUpperCase(input.charAt(i))) {
				n.append("000001");
				char c = Character.toLowerCase(input.charAt(i));
				n.append(hm.get(c));
			} else {
				n.append(hm.get(input.charAt(i)));
			}
		}
		return n.toString();
	}	
	
}
