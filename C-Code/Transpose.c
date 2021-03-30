/* accept a matric of order MxN and find its transpose */
#include <stdio.h>
void main()
{
	static int array[10][10];
	int i, j, m, n;
	printf("Enter the order of the matric \n");
	scanf("%d %d", &m, &n);
	printf("Enter the coefiicients of the matrix \n");
	for(i=0; i<m; i++)
	{
		for(j=0; j<n; j++)
		{
			scanf("%d", &array[i][j]);
		}
	}
	
	printf("The given matix is \n");
	for(i=0; i<m; i++)
	{
		for(j=0; j<n; j++)
		{
			printf(" %d ", array[i][j]);
		}
		printf("\n");
	}
	
	printf("Transpose of matric is \n");
	for(j=0; j<n; j++)
	{
		for(i=0; i<m; i++)
		{
			printf(" %d ", array[i][j]);
		}
		printf("\n");
	}
}