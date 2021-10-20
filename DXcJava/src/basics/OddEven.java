package basics;

public class OddEven {

	public static void main(String[] args) {
		findOddEven(13);

	}

	private static void findOddEven(int number) {
		if(number%2 == 0) {
			System.out.println(number+"is a  Even no");
			
		}
		else {
			System.out.println(number+"is a Odd no");
		}
		
		
		
	}

}
