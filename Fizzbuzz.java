
public class Fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		int i = 1;
		
		//for (int i = 1; i <= n; i++) {
		while (i <= n){
			
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("FizzBuzz");
			}
		    else if (i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
			i = i + 1;
		}
	}

}
