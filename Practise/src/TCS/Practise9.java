package TCS;

public class Practise9 {

	public static void main(String[] args) {
		int[] input = {1,2,3};
		int k = 3;
		int count = 0;
		for(int i=0;i<input.length;i++) {
			int sum = 0;
			for(int j=i;j<input.length;j++) {
				sum += input[j];
				if(sum==k) {
					count++;
				}
			}
		}

		System.out.println(count);
	}

}
