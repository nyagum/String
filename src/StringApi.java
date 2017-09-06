
public class StringApi {
	public static void main(){
		text();
	}
	public static void text(){
		String a="string/Test";
		
		//length
		System.out.println(a.length());
		
		//index searching
		System.out.println(a.indexOf("T"));
		
		// 특정구분자로 분해
		String temp[]=a.split("/");
		for(String item:temp){
			System.out.println(item);
		}
		
		String temp2[]=a.split("");
		System.out.println(a.substring(2, 7));
		
		System.out.println(a.replace("Te", "Px"));
		a.startsWith("Str");
		
		String addres="naver.com";
		if(!addres.startsWith("http://")){
			addres="http://"+addres;
		}
		
	}
	
	public void builderVsBuffer(){
		// jdk 1.5버전이사우터는 일반적인 스트링연산을StringBuilder로 컴파일러가 자동변환 해준다.
		String result="안"+"녕하"+"세요"+"반갑습니다";
		
		//비동기에서 안정성을 보장
		StringBuffer buffer=new StringBuffer();
		buffer.append("안").append("녕하").append("세요").append("반갑습니다.");
		
		System.out.println(buffer.toString());
		
		// 속도 빠름
		// 비동기에서 안정성을 보장하지 않는다.
		// 다중쓰레드 환경에서는 쓰지 않습니다.
		StringBuilder builder=new StringBuilder();
		builder.append("안").append("녕하").append("세요").append("반갑습니다.");
		
		System.out.println(builder.toString());
		
	}
	
	public static void StringConstantPool(){
		String a="안녕하세요";
		String b="안녕하세요";
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		//ConstantPool 에 안들어감
		String c=new String("안녕하세요");
		
		//new 로 만들어진 객체를 constant pool로 이동시긴다.
		String d=c.intern();
	}
}
