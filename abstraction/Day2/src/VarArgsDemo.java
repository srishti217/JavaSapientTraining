
public class VarArgsDemo {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6};
		int result = new VarArgsDemo().sum(numbers);
		System.out.println(result);

	}
	
	private int sum(int... numbers) {
		int total = 0;
		for(int number : numbers) {
			total = total + number;
		}
		return total;
	}
	
	private int sum1(int[] numbers) {
		int total = 0;
		for (int number : numbers) {
			total = total + number;
		}
		return total;
	}
}


