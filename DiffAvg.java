
public class DiffAvg {

	public static void main(String[] args) {
		int [] arr = new int[] {36,21,11,6,4}; //커서,테이블타입의 변수
		
		//arr  변수에 담긴 값들의 간격 평균 구하기 
		//36-21 = 15
		//21-11 = 10
		//11-6  = 5
		//6-4   = 2
		//  (15+10+5+2)/4 = 8
		int result = 0;
		int sum = 0;
     for (int i =0; i <arr.length-1; i ++){
    	 result= arr[i] - arr[i+1];
    	 sum += result;
     }
    System.out.println(sum); 
  
    
    int avg = sum / (arr.length-1);
    System.out.println(avg);
	}
   

}

