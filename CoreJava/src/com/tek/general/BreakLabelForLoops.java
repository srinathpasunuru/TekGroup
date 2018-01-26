package com.tek.general;

public class BreakLabelForLoops {

	public static void main(String[] args) {
		
		BreakLabelForLoops loops = new BreakLabelForLoops();
		loops.breakLabelforLoops();
		
	}
	private void breakLabelforLoops() {
		
		outer:{
			for(int number = 0; number < 3; number++) {
				System.out.println("loop " +number+":");
					for(int value =0; value<20; value++) {
						System.out.print(value+" ");
						if(value == 15) {
							break outer;
						}
					}
			}
		}
	System.out.println();
	System.out.println("loop is broken");
					
	}
}
	
