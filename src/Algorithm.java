
public class Algorithm {

	public static void main(String[] args) {
//		Algorithm a=new Algorithm();
//		long result=a.sumEvenNumber2(6);
//		System.out.println("result "+result);
//		StringApi.StringConstantPool();
//		System.out.println(AlgoCountNumber.count(10000, 8));
//		AlgoMath.testMath();
//		AlgoMath.getLottoNumbers();
//		System.out.println(AlgoMath.checkAnagram("a act", "ca at"));
	}
	public long sum(long max){
		long sum=(max*(max+1))/2;
		return sum;
	}
	public long sumevenNumber(long max){
		long sum=((max+2)*(max/2))/2;
		return sum;
	}
	public long sumOddNumber(long max){
		long sum=0;
		
		//짝수일때 
		if(max%2==0){
			sum=max*max/2/2;
		}
		else{
			sum=(max+1)*(max/2+1)/2;
		}
		return sum;
	}
	
	public long sumOddNumber2(long max){
		long result=0;
		if(max%2==0){
			result=max/2*max/2;
		}else{
			result=((max+1)/2)*((max+1)/2);
		}
		return result;
	}
	public long sumEvenNumber2(long max){
		long result=0;
		if(max%2==0){
			result=max/2*max/2+max/2;
		}else{
			result=((max+1)/2)*((max+1)/2)+((max+1)/2);
		}
		return result;
	}

}
