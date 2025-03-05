package activities;

public class Activity2 {

	public static void main(String[] args) {

		// Create the object for the class
		Activity2 actobj = new Activity2();

		// Initialize the array
		int[] inputArr = { 10, 77, 10, 54, -11, 10 };

		// Initialise the Search number and expected sum
		int searchNum = 10;
		int fixedSum = 30;

		// Call the Calculation function
		System.out.println("Does the sum equal to 30?: " + actobj.result(inputArr, searchNum, fixedSum));

	}

	public boolean result(int[] nums, int searchNum, int fixedSum) {
		int temp_sum = 0;

		// Loop through array
		for (int num : nums) {

			// If value is 10
			if (num == searchNum) {

				// Add them
				temp_sum += searchNum;
			}

			// Sum should not be more than 30
			if (temp_sum > fixedSum) {
				break;
			}
		}
		// Return true if condition satisfies
		return temp_sum == fixedSum;

	}
}
