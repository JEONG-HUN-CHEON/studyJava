package com.cjh.toy.Lotto;

import java.util.Arrays;

public class MyLotto {

	public static void main(String[] args) {
		
		
		
//		ArrayList<Integer> num = new ArrayList<>(7) ;
//		
//		for(int i = 0 ; i < 10;i++ ) {
//			System.out.println("제 "+ i + "회차 정훈 복권 당첨번호!");
//			for(int j = 0; j < 7; j++) {
//				num.add((int)(Math.random()*46));
//				if(num.contains(num)) {
//					num.remove(j);
//					num.add((int)(Math.random()*46));
//				}
//				
//			}
//			System.out.println(num);
//		}
		
//		int [] num1 = new int[7] ;
//		num1 = new int[]{1,2,3,4,5,6,7};
//		System.out.println(Arrays.toString(num1));
		
		int[] num2 = new int[6] ;
		
		
		for(int i = 0 ; i < 10;i++ ) {
			System.out.println("제 "+ (i+1) + "회차 정훈 복권 당첨번호!");
			try{
				for(int j = 0; j < 6; j++) {
					num2[j] = (int)(Math.random()*45) + 1 ;
					
					if(num2[j] == 0) {
						System.out.println("0이 포함되었습니다.");
						
					} else if(num2[i] == num2[j]) {
						System.out.println("중복값이 포함되었습니다.");
						
						continue;
					} 
					
					
				}
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.println(Arrays.toString(num2));
			}
			
			
		}
		
		
	}
	
	

}
