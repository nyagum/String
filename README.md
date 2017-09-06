# Java String api
나는 스트링이라네~~~

## String Api
1. length - 문자열의 길이를 구한다.
```java
String a="string/Test";
System.out.println(a.length());
```
2. indexof - 문자열의 위치를 리턴한다.
```java
System.out.println(a.indexOf("T"));
```	

## Math Api
수학 함수
1. round -값을 반올림
```java
Math.round(123.5);
```
2. 반올림
```java
long b=Math.round(123.5);
System.out.println(b);
```
3. 올림
```java
System.out.println((double)Math.ceil(343.1543));
```
4. 내림
```java
System.out.println((double)Math.floor((double)563.8));
```
5. 랜덤
```java
Math.random();
Random random=new Random();
random.nextInt(100);
```

## Algorithm
1. 짝수 더하기
```java
public long sumEvenNumber2(long max){
  long result=0;
  if(max%2==0){
    result=max/2*max/2+max/2;
  }else{
    result=((max+1)/2)*((max+1)/2)+((max+1)/2);
  }
  return result;
}
```
2. 홀수 더하기
```java
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
```
3. 로또번호 구하기
```java
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
```
4. 아나그램 알고리즘
```java
public static boolean checkAnagram(String a, String b){
  a.toLowerCase();
  b.toLowerCase();
  a=a.replace(" ", "");
  b=b.replace(" ", "");
  
  String temp="";
  char[] array;
  array=b.toCharArray();
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

    for(int i=0; i<array.length; i++){
      System.out.print(array[i]);
    }
    return (temp.equals(a));
  }
  else{
    return false;
  }
}
```