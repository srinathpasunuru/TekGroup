package com.tek.general;

public class BreakLabel {

	public static void main(String[] args) {
		
		BreakLabel label = new BreakLabel();
		label.breakLabel();
		
	}

	private void breakLabel() {
		
		boolean value = true;
		label1:{
			label2:{
				label3:{
					System.out.println("this is inside label 3");
						if(value) {
							break label2;
						}
					}
			
				}
		System.out.println("this is outside of the label 2");
	
			}
			
		}

}
