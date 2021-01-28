package solutionLevel1;

import java.util.Arrays;

public class Budget {// 예산
	public static void main(String[] args) {
//		int[] d = {1,3,2,5,4};
		int[] d = {2,2,3,3};
//		int budget = 9;
		int budget = 10;
		
 		System.out.println(new Budget().solution(d, budget));
 		
	}
	public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++){
        	if(budget - d[i] >= 0){
        		budget -= d[i];
        		answer++;
        	}
        }
        return answer;
    }
}
