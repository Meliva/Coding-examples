/* Checks if a given number is armstrong */
#include <stdio.h>
#include <math.h>
void main()
{
	int number, sum = 0, remainder = 0, cube = 0, temp;
	printf ("enter a number "); 
	scanf("%d", &number);
	temp = number;
	while (number != 0)
	{
		remainder = number % 10;
		cube = pow(remainder, 3);
		sum = sum + cube;
		number = number / 10;
	}
	if(sum == temp)
	{
		printf("The given number is an armstrong number");
	}
	else
	{
		printf("The given number is not an armstrong number");
	}
}