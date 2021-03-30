/* Reverse a number and check if it is a palindrome */
#include <stdio.h>
void main()
{
	int num, temp, remainder, reverse = 0;
	printf("Enter an integer \n");
	scanf("%d", &num);
	/* The origianl number is stored as a temperay number */
	temp = num;
	while(num > 0)
	{
		remainder = num % 10;
		reverse = reverse * 10 + remainder;
		num /= 10;
	}
	printf("Given number is = %d\n", temp);
	printf("Its reverse is = %d\n", reverse);
	if(temp == reverse)
	{
		printf("Number is a palindrome \n");
	}
	else
	{
		printf("Number is not a palindrome \n");
	}
}