#include <stdio.h>
void main()
{
	int ival, remainder;
	printf("Enter an integer : ");
	scanf("%d", &ival);
	remainder = ival % 2;
	if (remainder == 0)
	{
		printf("%d is an even interger\n", ival);
	}
	else
	{
		printf("%d is an odd integer \n", ival);
	}
}