
public class MonthlySales {
	public static void main(String args[]){
		double sum = 0;
		double average = 0;
		double [] monthlySales= {50000.0 , 40000.1, 55000.0 ,30000.0,
		250000.2, 600000.2, 450000.0, 36000.0 ,28000.0, 15000.1, 700000.2,
		15000.0};
for (int i = 0; i< monthlySales.length; i++) {
	sum = sum + monthlySales[i];
	average = sum/monthlySales.length; // calculates the moo
	
}
System.out.println(sum);
System.out.println(average);

		double SmallestSalary = monthlySales[0];
		double LargestSalary = monthlySales[0];
		
for (int i = 0; i < monthlySales.length; i++) {
	if(SmallestSalary > monthlySales[i+1]){
	
	SmallestSalary = monthlySales[i+1];
	i++;
	}
}

for (int i = 0; i < monthlySales.length-1; i++) {
	if(LargestSalary < monthlySales[i+1]){
	
	LargestSalary = monthlySales[i+1];
	i++;
	}
}

System.out.println(SmallestSalary);
System.out.println(LargestSalary); 


}	
}
