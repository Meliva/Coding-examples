/* Checks whether a given number is a perfect number, perfect number is a number whic is equal to sum of its divisor. For eg, divisor of 6 are 1,2 and 3. The sum of these divisotrs is 6. So 6 is called as perfect number. */
#include <stdio.h>
int main()
{
	int number, rem, sum = 0, i;
	printf("Enter a Number\n");
	scanf("%d", &number);
	for(i = 1; i <= (number -1); i++)
	{
		rem = number % i;
		if(rem == 0)
		{
		sum = sum + i;
		}
	}
	if(sum == number)
	{
		printf("Entered number is a perfect number");
	}
	else
	{
		printf("Entered number is not a perferect number");
	}
	return 0;
}