/*
	    1
	   232
	  34543
	 4567654
	567898765
*/
#include <stdio.h>
int main()
{
	int n, c, row, num = 1, space;
	
	printf("Enter number of rows\n");
	
	scanf("%d", &n);
	
	space = n - 1;
	
	for (row = 1; row <= n; row++)
	{
		num = row;
		
		for (c = 1; c <= space; c++)
			printf(" ");
		
	space--;
		
		for (c = 1; c <= row; c++)
		{
			printf("%d", num);
			num++;
		}
		
		num = num - 2;
		
		for (c = 1; c < row; c++)
		{
			printf("%d", num);
			num--;
		}
		
		printf("\n");
	}
	return 0;
}
/* Not neat as the one presetned above */