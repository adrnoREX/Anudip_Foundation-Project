// Perfect Number : WAP to find a number whether the number is perfect or not.

package perfect_no; // package declaration

import java.util.Scanner; // importing the util package to use scanner class
public class PerfectNo {
	public static void main(String[] args) { // main method
		Scanner sc = new Scanner(System.in); // create an instance of sc object of scanner class
		int sum=0; // set sum initialize to zero 
		System.out.println("Enter the number to know it is perfect or not"); // displaying the message from user to input the number
		int num = sc.nextInt(); // initializing the num variable using sc so the user can input
		for(int i =1;i<=num/2;i++) { // repeat the steps from i=1 upto the number divide by 2
			if(num%i==0) { // checking whether the original number with modulus of i value results becomes zero then 
				sum +=i;  // summation will be performed
			}
		}
		if(sum==num) { //lastly now we are checking the actual number with the summation of the i values
			System.out.println(num+" is a perfect number"); // dispalying the message if it is perfect no
		}
		else {
			System.out.println(num+" is not a perfecct number"); // dispalying the message if it is perfect no
		}
	}
}

/*Output:
Enter the number to know it is perfect or not
28
28 is a perfect number

Enter the number to know it is perfect or not
29
29 is not a perfecct number
*/