package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         * 배열
         * - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
         * - 참조형 타입이다.
         * - 인덱스로 값을 구분한다.
         * - 길이를 변경 할 수 없다.
         */ 
		
		int[] array; //배열의 주소를 저장할 공간이 만들어진다. ------------배열 선언
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다. ---------------- 배열 초기화 
		//배열 초기화시 기본값이 저장된다.
		//boolean: false 기본값
		//char: ' '
		//참조형타입(배열, string) : null
		
		array = new int[]{1,2,3,4,5};
		
//		array = {1,2,3,4,5};
		//선언과 초기화를 동시에 해야한다.
		int[] array2 = {1,2,3,4,5};
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);		
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
			
		}
		System.out.println(" 합계 :" + sum);
		
		//자동완성: Ctrl + spacebar
		//한줄복사: Ctrl + Alt + 방향키
		//한줄이동: Alt + 방향키
		//한줄삭제: Ctrl + d
		
		
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		
		int[] arr = new int[10];  
		
		//배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요.
		for(int i = 0; i <array.length; i++){
	
		    arr[i] = (int)(Math.random()* 100 )+ 1;
		}    		
			
		// 배열에 저장된 모든 값의 합계와 평균을 구해주세요.
		sum = 0;
	    for (int i = 0; i < array.length; i++){
	    	sum += array[i];
	    }
		double avg = (double)sum / array.length;
	    System.out.println(" 합계 :" + sum + " / 평균 : " + avg);
	    
	    // 배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
	    
	    	
	    	int min = arr[0];
	    	int max = arr[0];
	    	
	    	
	    	for(int i =  0; i <arr.length; i ++){
	    		if(arr[i] < min){
	    			min = arr[i];
	    		}
	    		if(max < arr[i]){
	    				max = arr[i];
	    	}
	    	}
	    	
	    	System.out.println("min : "+ min + " / max : " + max);
	    	
	    	int[] shuffle = new int[10];
	    	for(int i = 0; i <shuffle.length; i++){
	    		shuffle[i] = i + 1;
	    	}
	    	 System.out.println(Arrays.toString(shuffle));
	    	
	    
	    // 배열의 값을 섞어주세요.
	    // 랜덤한 인덱스를 발생시킨다.
	    //0번 인덱스와 랜덤 인덱스의 값을 교환한다.
	    //위내용을 반복한다.
	    	
	  	   for(int i = 0; i <shuffle.length; i++){
	  		   
	  			  arr[i] = (int)(Math.random()* 10 )+ 1;
	  			  
	  		}    	  
	  	   System.out.println(Arrays.toString(shuffle));
	   
	   
	   int random = (int) (Math.random()* shuffle.length);{
	   int temp = shuffle[0];
	   shuffle[0] = shuffle[random];
	   
	   shuffle[random] = temp;
	}
	System.out.println(Arrays.toString(shuffle));
		
	//1~10사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
	
	 random = (int) (Math.random()* shuffle.length);{
	    int[] count = new int[10];
		
		for(int i = 0; i < 500; i++){
			int ran = (int)(Math.random()* 10)+1;
			count[ran-1]++;
		}
		System.out.println(Arrays.toString(count));		
			  
		for(int i = 0; i < arr. length -1; i ++);
			  
			  
			  
			  
		}    	  
	    
		
		
	    
	}    		
	
	
	
	
	
	}










