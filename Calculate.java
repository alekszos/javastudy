public class Calculate {

public static void main(String[] args) {

System.out.println("Calculate...");
	int first = Integer.valueOf(args[0]);
	int second = Integer.valueOf(args[1]);
	int sum = first + second;
	int subst = first - second;
	int divi = first / second;
	int multi = first * second;
	
	
	
	System.out.println("Sum " + sum);
	System.out.println("Substraction " + subst);
	System.out.println("Division " + divi);
	System.out.println("Multiplication " + multi);
	
	

}

}