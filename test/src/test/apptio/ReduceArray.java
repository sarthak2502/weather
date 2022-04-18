package test.apptio;

public class ReduceArray {

	public static void main(String[] args) {

//		int[] a = new int[] {4,2,3,6,7,8,1,2};
//		int[] a = new int[] {5,6,2,6,8,9,1,2};
		int[] a = new int[] {5,1,6,7,8,9,4};
		int k = 2;
		try {
			System.out.println(reduceArray(a, k));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int reduceArray(int[] a, int k) throws Exception {
		if (k > a.length) {
			throw new Exception("Index out of bound !!!");
		}
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int i=0, j=a.length -1;
		if (k == 1) {
			if (a[i] < a[j])  {
				i++; 
			} else {
				j --;
			}
		} else {
			while (k > 0) {
				sum1 = a[i] + a[j];
				sum2 = a[i] + a[i+1];
				sum3 = a[j] + a[j-1];
				if (sum1 < sum2 && sum1 < sum3) {
					if (a[i] < a[j])  {
						i++; 
					} else {
						j --;
					}
				} else if (sum2 < sum1 && sum2 < sum3) {
					i++;
				} else if (sum3 < sum1 && sum3 < sum2) {
					j--;
				}
				k--;
			}
		}
		int sum = 0;
		while (i!=j+1) {
			sum += a[i++];
		}
		
		return sum;
	}
	/*
	 * if i + j is small
			evict small of i or j
			small ++
		i + i+1
			evict i
			i++
		j + j-1
			evict j
			j--
	 */
}
