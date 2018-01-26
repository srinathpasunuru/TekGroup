package com.tek.general;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class ForLoopBreak {

	public static void main(String[] args) {
		
		ForLoopBreak loop = new ForLoopBreak();
		loop.forLoopBreak();
		
	}

	private void forLoopBreak() {
		
		for(int number = 0; number < 50; number++) {
			System.out.println(number);
			if(number == 20) 
				break;
			
		}
		System.out.println("loop is broken");
	}

}
