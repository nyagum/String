import java.util.Random;

public class AlgoMath {
	public static void testMath(){
		int a=Math.abs(-123); //절대값
		
		//반올림
		long b=Math.round(123.5);
		System.out.println(b);
		
		// 올림
		System.out.println((double)Math.ceil(343.1543));
		
		// 내림
		System.out.println((double)Math.floor((double)563.8));
		
		Math.random();
		
		Random random=new Random();
		random.nextInt(100);
		
	}
	
	public static void getLottoNumbers(){
		int[] result=new int[6];
		boolean flag=false;
		Random random=new Random();
		
		// 동적배열 - 크기를 제한하지 않는 객체 배열
		// 종류:List, Set, Map
		// List = 인덱스와 값을 가지고 있는 배열
		// Set = 키와값을 가지고 있는 동적 배열, 값의 중복이허용됨 
		// Map map=new HashMap();
		// map.put("키", 33);
		for(int i=0; i<6; i++){
			
			//random 함수에서 발생되는 난수는 중복 될 수 있다.
			int temp=random.nextInt(45)+1;
			
			// 중복값에 대한 예외처리
			for(int j=0; j<result.length; j++){
				if(temp!=result[i]){
					flag=true;
					break;
				}
			}
			if(flag){
				result[i]=temp;
			}
		}
		for(int i=0; i<6; i++){
			System.out.print(result[i] +" ");
		}
	}
	
	/**
	 * 애너그램 알고리즘
	 * 
	 * 두 개의 문자열 입력을 받아서 두개의 관게가 아나그램관계인지 확인하는 프로그램을 개발하세요
	 * option 받은 문자열의 공백 제거
	 * 1. 받은 문자열의 길이를 체크, 길이가 다르면 검사하지 않는다.
	 * 2. 받은 문자열을 정렬 Array.sort
	 * 3. 정렬된 문자열을 비교
	 * cat -> act
	 * listen -> silent
	 * 
	 * */
	
	public static boolean checkAnagram(String a, String b){
		a.toLowerCase();
		b.toLowerCase();
		a=a.replace(" ", "");
		b=b.replace(" ", "");
		
		String temp="";
		char[] array;//=new char[b.length()];
		array=b.toCharArray();
//		for(int i=0; i<array.length; i++){
//			System.out.print(array[i]);
//		}
		if(a.length()==b.length()){
			for(int i = 0; i<a.length(); i++){
				for(int j=0; j<b.length(); j++){
					if(a.charAt(i)==array[j]){						
						temp=temp+array[j];
						array[j]=' ';
						break;
					}
				}
			}
//			System.out.println("======================\n"+temp);
//			System.out.println(a);
//			System.out.println(b);
			
			for(int i=0; i<array.length; i++){
				System.out.print(array[i]);
			}
			return (temp.equals(a));
		}
		else{
			return false;
		}
	}
}
