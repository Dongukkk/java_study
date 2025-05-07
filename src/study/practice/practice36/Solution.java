package study.practice.practice36;

import java.util.*;

class Solution {

	// 최빈값 구하기
	public int solutionMap(int[] array) {
		int answer = 0;
		int max = array[0];
		int cnt = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			int count = map.getOrDefault(array[i], 0) + 1;
			map.put(array[i], count);
		}

		for (int key : map.keySet()) {
			if (map.get(key) > cnt) {
				cnt = map.get(key);
				max = key;
				answer = max;
			} else if (map.get(key) == cnt)
				answer = -1;
		}

		return answer;
	}
	public int solutionMap2(int[] array) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		//{1,2,3,3,3,4}
		for(int n: array) {
			
			//map에 해당 값이 key 있나?
			if(map.containsKey(n)) {
				
				
				int newCount = map.get(n) + 1;
				map.put(n, newCount);
			} else {
				map.put(n, 1);
			}
		}
		
		for(int key : map.keySet()) {
			System.out.printf("Key:%d value:%d\n", key, map.get(key));
		}
		
		return 0;
	}

	public int solution(int[] array) {
		int answer = 0;
		int num = 0;
		int max = 0;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}
			if (max < count) {
				max = count;
				num = array[i];
				answer = array[i];
			} else if (max == count && !(num == array[i]))
				answer = -1;
		}
		return answer;

	}
}
