package solutionLevel2;

public class Tel { // 전화번호 목록
	public static void main(String[] args) {
//		String[] phone_book = {"119", "97674223", "1195524421"};
		String[] phone_book = {"123","456","789"};
//		String[] phone_book = {"12","123","1235","567","88"};
		System.out.println(new Tel().solution(phone_book));
	}
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i = 0; i < phone_book.length-1;i++){
        	for(int j = i+1 ; j < phone_book.length; j++){
        		if(phone_book[j].startsWith(phone_book[i])){
        			return false;
        		}
        		if(phone_book[i].startsWith(phone_book[j])){
        			return false;
        		}
        	}
        }
        return answer;
    }
}
