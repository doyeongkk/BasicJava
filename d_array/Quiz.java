package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
//		quiz1(); //거스름돈의 동전 개수
		
//		quiz2(); //그래프 그리기
		
		quiz3(); // 같은 숫자는 싫어
		
//		quiz4(); // 나누어 떨어지는 숫자배열
		
		
		
	}

//	private static void quiz4() {
//	       int[] arr = new int[100];
//	       for(int i = 0; i < arr.length; i ++){
//	    	   arr[i] = (int)(Math.random()* 100 )+1;
//	       }
//	
//	       /*
//	        * 2~5 사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이루어진 배열을 정렬하여 출력해주세요.
//	        * 5
//	        * [5,10,15,15,20,25]
//	        */
//            int[]temp = new int[100];
//            int n= (int)(Math.random()*4)+2;
//            for(int i = 0; 1 < arr.lengh; i ++){
//        	   if(arr[i]%n ==0){
//        		   temp[]= arr[i];
//        	   }
//            }
//      arr= new int [count];
//      for(int i = 0; i < arr.length; i ++){
//    	  arr[i] = temp [i]      }
//      
//      
//     int tmp=arr[i];
//     arr[i] = arr[min];
//     arr[min] = temp;
//      
//      System.out.println("n:"
//      
	private static void quiz3() {
		int[]arr = new int[10];
		for(int i = 0; i < arr.length; i ++){
			arr[i] = (int)(Math.random()* 5 ) +1;
		}
		System.out.println(Arrays.toString(arr));
		/*
		 * 1~5 사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
		 * [1,3,3,2,1,4,5,5,1,3]
		 * [1,3,2,4,5]
		 */
		
		int[] temp = new int[5];
		int count = 0;
		for (int i= 0; i < arr.length; i ++){
			boolean flag = false;
			for(int j = 0; j < temp.length; j ++){
				if(arr[i] == temp[j]){
					flag = true;
				}
			}
			
			if(!flag){
				temp[count ++] = arr[i];
			}
			
			System.out.println(Arrays.toString(temp));
		}
		
		int[] result = new int[count];
		for(int i = 0; i < result.length; i ++){
			result[i] = temp[i];
			
		
		}
		
		System.out.println(Arrays.toString(result));
		
		
	}

	
	
	
	
	
	
	private static void quiz() {
		int[] arr = new int[20];
		for(int i = 0; i < arr.length; i ++){
			arr[i] = (int)(Math.random()* 5 )+ 1;
		}
		System.out.println(Arrays.toString(arr));
		
       /*
        * 1~5 의 숫자가 발생된 만큼 *을 사용해 그래프를 그려주세요.
        * 
        * 1 : ***3
        * 2 : ****4
        * 3 : **2
        * 4 : *****5
        * 5 : *1
        */
		
		int[] count = new int[5];
		for (int i= 0; i< arr.length; i++){
	    	count[arr[i] - 1 ]++;
		}
		for (int i = 0; i < count.length; i++){
			System.out.println(i+1+":");
			for(int j = 0; j < count[i]; j ++){
				System.out.println("*");
			}
			System.out.println(" " + count[i]);
		}

	    }
	         	
	  
	    
	
	
	
	
	
	
	
	
	    private static void quiz1() {
		int money = (int)(Math.random() * 500)* 10;
		int [] coin = {500,100,50,10};
		System.out.println("거스름돈: " + money);
		/*
		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
		 * 
		 * 거스름돈: 2860원
		 * 500원 : 5개
		 * 100원 : 3개
		 * 50원: 1개
		 * 10원  1개
		 */
		for(int i = 0; i < coin.length; i ++){
		int count = money / coin[i];
		System.out.println(coin[i]+"원"+count+"개");
		money = money % coin[i];
		
		
		}
		
		
	}

}
