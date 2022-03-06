package assignment03032022;

public class diffof2arrays {
	class Largest_Difference_GFG {
		public static int[] Maximum_Diff(int a[], int n)
		{
			int diff, greatest_diff = a[1] - a[0];
			int ele1 = a[1], ele2 = a[0];
			int res[] = new int[3];
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					diff = Math.abs(a[i] - a[j]);
					if (diff > greatest_diff) {
						greatest_diff = diff;
						ele1 = a[i];
						ele2 = a[j];
					}
				}
			}
			res[0] = greatest_diff;
			res[1] = ele1;
			res[2] = ele2;

			return (res);
		}
		public static void main(String[] args)
		{

			int arr[] = { 10, 11, 88, 2, 12, 120 };

			int size = arr.length;
			int[] result;

			result = Largest_Difference_GFG.Maximum_Diff(arr,
														size);

			System.out.println("Greatest Difference:"
							+ result[0]);
			System.out.println(
				"Two elements with largest difference: "
				+ result[1] + " and " + result[2]);
		}
	}


}
