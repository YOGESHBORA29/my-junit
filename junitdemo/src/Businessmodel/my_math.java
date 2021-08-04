package Businessmodel;

public class my_math {
	public my_math() {

    }
    public int sum(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}
