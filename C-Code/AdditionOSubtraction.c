/* Reads two matrices A(MxN) and B(MxN) and perform addition or subtraction of A and B.
   Also, find the trace of the resultant matrix. Display the given matrices, their sum or differences and the trace. */
#include <stdio.h>
void trace(int arr[][10], int m, int n);
void main()
{
	int array1[10][10], array2[10][10], arraysum[10][10], arraydiff[10][10];
	int i, j, m, n, option;
	printf("Enter the order of the matrix array1 and array2 \n");
	scanf("%d %d", &m, &n);
	printf("Enter the elements of matix array1 \n");
	for(i=0; i<m; i++)
	{
		for(j=0; j<n; j++)
		{
			scanf("%d", &array1[i][j]);
		}
	}
	printf("MATRIX array1 is \n");
	for (i=0; i<m; i++)
	{
		for(j=0; j<n; j++)
		{
			printf(" %d ", array1[i][j]);
		}
		printf("\n");
	}
	
	printf("\nEnter the elements of matrix array2 \n");
	for(i=0; i<m; i++)
	{
		for(j=0; j<n; j++)
		{
			scanf("%d", &array2[i][j]);
		}
	}
	printf("MATRIX array2 is \n");
	for(i=0; i<m; i++)
	{
		for(j=0; j<n; j++)
		{
			printf(" %d ", array2[i][j]);
		}
		printf("\n");
	}
	
	printf("Enter you option: 1 for addition and 2 for subtraction \n");
	scanf("%d", &option);
	switch (option)
	{
		case 1:
			for(i=0; i<m; i++)
			{
				for(j=0; j<n; j++)
				{
					arraysum[i][j] = array1[i][j] + array2[i][j];
				}
			}
			printf("Sum matric is \n");
			for(i=0; i<m; i++)
			{
				for(j=0; j<n; j++)
				{
					printf(" %d ", arraysum[i][j]);
				}
				printf("\n");
			}
			trace (arraysum, m, n);
		break;
		
		case 2:
			for(i=0; i<m; i++)
			{
				for(j=0; j<n; j++)
				{
					arraydiff[i][j] = array1[i][j] - array2[i][j];
				}
			}
			printf("Difference matric is \n");
			for(i=0; i<m; i++)
			{
				for(j=0; j<n; j++)
				{
					printf(" %d ", arraydiff[i][j]);
				}
				printf("\n");
			}
			trace (arraydiff, m, n);
		break;
	}
}
/* Fuction to find the trace of a given matrix and print it */
void trace(int arr[][10], int m, int n)
{
	int i, j, trace=0;
	for(i=0; i<m; i++)
	{
		for(j=0; j<n; j++)
		{
			if(i==j)
			{
				trace = trace + arr[i][j];
			}
		}
	}
	printf("Trace of the resultant matrix is = %d\n", trace);
}
/* subtraction resulted in wrong number when tested */