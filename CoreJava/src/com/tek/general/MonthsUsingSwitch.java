package com.tek.general;

public class MonthsUsingSwitch {

	public static void main(String[] args) {
		
		int month_number = 7;
		MonthsUsingSwitch month = new MonthsUsingSwitch();
		month.getMonth(month_number);
		
	}

	private void getMonth(int month_number) {
		
		String season_name = null;
		
		switch(month_number) {
		case 12:
		case 1:
		case 2:
			season_name = "Winter";
			break;
		case 3:
		case 4:
		case 5:
			season_name = "Spring";
			break;
		case 6:
		case 7:
		case 8:
			season_name = "Summer";
			break;
		case 9:
		case 10:
		case 11:
			season_name = "Autumn";
			break;
			default:
				System.out.println("there is no month with the given number and so no season for it");
			
		}
		System.out.println("july is in " + season_name + " season");
	}

}
