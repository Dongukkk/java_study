package study.practice.practice37;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Returns a completion of the value and message";
		

//		1. 이 문장에 사용된 알파벳의 갯수는 몇개인가요?
//		(중복된 수 제외, 대소문자 구분X)
//		Ex) R r 둘다 구분하지 않고 알파벳 r 한개라고 체크
//
//		2. 이 문장에 사용된 알파벳들이 각각 몇 글자씩 있는지 세어보고 출력하세요.

		str = str.toLowerCase(); // 소문자로
		str = str.replace(" ", ""); // 띄어쓰기 제거

		HashSet<Character> set = new HashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}

		System.out.println(set.size());

		HashMap<Character, Integer> map_ = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			
			char c = str.charAt(i);
			
			map_.put(c, map_.getOrDefault(c, 0)+1);
			/*
			if (map.containsKey(c)) {
				map_.put(c, map_.get(c) + 1);
			} else {
				map_.put(c, 1);
			}
			*/
		}
		
		for(char key : map_.keySet()) {
			System.out.println("알파벳:"+ key + " 갯수:" + map_.get(key));
		}
		
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		String[] strArr = str.toLowerCase().split("");
//
//		for (String s : strArr) {
//
//			if (map.containsKey(s)) {
//
//				int newCount = map.get(s) + 1;
//				map.put(s, newCount);
//			} else {
//				map.put(s, 1);
//			}
//		}
//		map.remove(" ");
//
//		System.out.println("1. 이 문장에 사용된 알파벳의 갯수는 몇개인가요?");
//		System.out.println(map.size() + "개");
//
//		System.out.println("2. 이 문장에 사용된 알파벳들이 각각 몇 글자씩 있는지 세어보고 출력하세요.");
//		for (String s : map.keySet()) {
//			System.out.printf("알파벳:%s	%d개\n", s, map.get(s));
//		}

	}
}
