package solutionLevel1;
// git 실험중
// 다시 실험중
public class AVG { // 평균 구하기
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
//		int[] arr = {5,5};
		System.out.println(new AVG().solution(arr));
	}
	public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for(int i : arr){
        	sum += i;
        }
        return answer = (double)sum/arr.length;
    }
}
