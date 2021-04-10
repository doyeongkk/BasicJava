package phamarcy;

import java.util.Arrays;



public class Chemist {

	public static void main(String[] args) {
	 employee employee1 = new employee();
	 
	 String[]order = employee1.prescriptionorder();
	 System.out.println(Arrays.toString(order));

	 
	 System.out.println("약 조제중....... 완성!!");
	 String[] drugs = {"완성된 감기약" ,"완성된 진통제"};
	 
	 employee1.serve(drugs);
	 
	 employee1.pay(order);
	}

}
