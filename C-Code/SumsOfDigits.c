/* C program to accept and integer & find the sum of its digits */
#include <stdio.h>
void main()
{
	long num, temp, digit, sum = 0;
	
	printf("Enter the number \n");
	scanf("%d", &num);
	temp = num;
	while (num > 0)
	{
		digit = num%10;
		sum = sum + digit;
		num /= 10;
	}
	printf("Given number = %d\n", temp);
	printf("Sum of the digits %d = %d\n", temp, sum);
}
/* removed the 1 from %1d BEFORE: %1d AFTER: %d