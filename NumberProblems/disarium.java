// Write a Java program to check whether a number is a Disarium number.

import java.util.*;
class disarium{
public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	System.out.println("enter the number");
	int num = sc.nextInt();

	disarium(num);

}

public static void disarium(int num){
     int original=num;
	int temp=num;
	int sum=0;
    int count=0;

	int divisor=1;
// Count number of digits
	while(temp>0){
		count++;
		temp=temp/10;

	}

	System.out.println(count);
// Find highest place value

	for(int i=1;i<count;i++){
		divisor = divisor*10;
	}

System.out.println(divisor);
// Extract digits from left to right
int position=1;
while(divisor>0){
	int dig = num/divisor;
	int power=1;

	for(int i=1;i<=position;i++){
		power = power*dig;

	}
	sum=sum+power;
	num=num%divisor;
	divisor=divisor/10;
	position++;
}
if (sum == original) {
            System.out.println("Disarium Number");
        } else {
            System.out.println("Not a Disarium Number");
        }
}


}

/*
Step-by-step algorithm
1. Start the program.

2. Take a number as input from the user.

3. Store the original number in a separate variable.
- original = num
- temp = num
4. Initialize:
- sum = 0
- count = 0
- divisor = 1
5. Count the total number of digits.
- Extract digits using temp / 10.
- Increase count by 1.
- Repeat until temp becomes 0.
6. Find the highest divisor.
- Multiply divisor by 10.
- Repeat count - 1 times.
7. Initialize position = 1.

8. Extract the digit from left to right.
- digit = num / divisor
9. Calculate the power of the digit.
- Initialize power = 1.
- Multiply power by digit, position times.
10. Add the power to the sum.
- sum = sum + power
11. Remove the extracted digit.
- num = num % divisor
12. Reduce the divisor.
- divisor = divisor / 10
13. Increase the position.
- position++
14. Repeat steps 8–13 until divisor becomes 0.

15. Compare the sum with the original number.
- If equal → Disarium number.
- Otherwise → Not a Disarium number.
16. Stop.
Dry run: Input = 135
Digit position calculation
1
Position 1

1¹ = 1


3
Position 2

3² = 9


5
Position 3

5³ = 125




1 + 9 + 125 = 135*/