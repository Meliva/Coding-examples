/* Reverses a number */
#include <stdio.h>
void main()
{
	long num, reverse = 0, temp, remainder;
	printf("Enter the number\n");
	scanf("%d", &num);
	temp = num;
	while (num >0)
	{
		remainder = num % 10;
		reverse = reverse * 10 + remainder;
		num /= 10;
	}
	printf("Given number = %d\n", temp);
	printf("Its reverse is = %d\n", reverse);
}
/* removed 1 in '%1d' BEFORE: %1d, AFTER: %d */