
public class tax {
	public static void main(String args[]){
		double MonthlyIncome = 60000;
		double tax, FivePercent,TenPercent, TwentyPercent;

if(MonthlyIncome <= 15000) {
	tax = 0;
	System.out.println(tax);
	}
	else if (MonthlyIncome > 15000 && MonthlyIncome <= 30000){
		FivePercent = (0.05*(MonthlyIncome - 15000));

		tax = FivePercent;

		System.out.println(tax);

	}

	else if (MonthlyIncome > 30000 && MonthlyIncome <= 50000){
		FivePercent = (0.05*15000);
		TenPercent = (0.10*20000);

	 tax = TenPercent + FivePercent ; //this adds the first tax bracket with the other money that is left

		System.out.println(tax);
	}
	else if (MonthlyIncome > 50000) {
		FivePercent = (0.05*15000);
		TenPercent = (0.10* 20000);
		TwentyPercent = (0.20*(MonthlyIncome - 50000));

	 tax = TwentyPercent + TenPercent + FivePercent ;

		System.out.println(tax);
	}



	}
	}

