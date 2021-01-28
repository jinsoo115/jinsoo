package solutionLevel1;

public class FailureLate {// 카카오 실패율
	public static void main(String[] args) {
		int N = 5;
//		int N = 4;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
//		int[] stages = {4,4,4,4,4};
		
		int[] answer = new FailureLate().solution(N, stages);
		for(int i =0; i < answer.length; i++){
			System.out.println(answer[i]);
		}
	}
	public int[] solution(int N, int[] stages) {
		// 실패율 배열만들기
		double[] fail = new double[N];
		
		// for문돌리기 스테이지 수만큼
		for(int i =1; i <= N; i++){
			int stage = i;
			double failUser = 0;// 도달만 한자 변수
			double clearUser = 0;//클리어하고 넘어간 사람 변수
			for(int j = 0; j < stages.length; j++){		// 각각 카운트하기
				if(stage <= stages[j]){
					clearUser++;
				}
				if(stage == stages[j]){
					failUser++;
				}
			}
			if(failUser==0){//0인경우방지해주기
				fail[i-1] =0;
				continue;
			}
			fail[i-1] = failUser/clearUser;	// 실패율 저장하기 
		}
        int[] answer = new int[N];
        
        for(int i = 0; i < fail.length; i++){
        	double max = -1;
        	int maxIndex = 0;
        	for(int j = 0; j < fail.length; j++){
        		if(max < fail[j]){
        			max = fail[j];
        			maxIndex = j;
        		}
        	}
        	answer[i] = maxIndex+1;
        	fail[maxIndex] =-1;
        }
        
        return answer;
    }
}
