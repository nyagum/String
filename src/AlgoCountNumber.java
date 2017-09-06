/**
 * 입력값을 정수m,n으로 받았을때
 * 1부터 정수m까지 정수 n이 몇 개가 있는지 카운트 하세요.
 * 
 * 예) 입력값 m=10000, n=8
 * 1부터 10000사이에 8이라는 숫자가 몇 개가 있느지 카운트 하는데 8888의 겨우는 4로 카운트 됩니다.
 * @author anya
 *
 */
public class AlgoCountNumber {
	public static int count(int m, int n){
		int result=0;
		StringBuilder builder=new StringBuilder();
		for(int i=1; i<m; i++){
				builder.append(i);
		}
		for(int i=0; i<builder.length(); i++){
			if((String.valueOf(n).equals(builder.charAt(i)))){
				result++;
			}
		}
		//System.out.println(builder.toString());
		return result;
	}
}
