package com.tek.general;

public class ContinueExample {

	public static void main(String[] args) {
		
		ContinueExample con = new ContinueExample();
		con.continueExample();
	}

	private void continueExample() {
		
		for(int number =0; number< 24; number++) {
			System.out.print(number+" ");
			if(number%2 == 0) {
				continue;
			}
			System.out.println();
		}
	}
}
