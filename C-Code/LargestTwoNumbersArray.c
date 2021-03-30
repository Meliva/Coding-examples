/* Reads four integer numbers into an array and find the average of two largest numbers of the given numbers without sorting the array. The program should output the given four numbers and the average. */
#include <stdio.h>
#define MAX 4
void main()
{
	int array[MAX], i, largest1, largest2, temp;
	printf("Enter %d integer numbers \n", MAX);
	for(i=0; i<MAX; i++)
	{
		scanf("%d", &array[i]);
	}
	printf("Input integer are \n");
	for (i = 0; i < MAX; i++)
	{
		printf("%d ", array[i]);
	}
	printf("\n");
	/* assume first element of array is the largest */
	largest1 = array[0];
	/* assume second element of array is the largest */
	largest2 = array[1];
	if(largest1 < largest2)
	{
		temp = largest1;
		largest1 = largest2;
		largest2 = temp;
	}
	for (i = 2; i < 4; i++)
	{
		if(array[i] >= largest1)
		{
			largest2 = largest1;
			largest1 = array[i];
		}
		else if (array[i] > largest2)
		{
			largest2 = array[i];
		}
	}
	printf("%d is the first element and is largest \n", largest1);
	printf("%d is the second element and is the largest \n", largest2);
	printf("\n Average of %d and %d = %d \n", largest1, largest2, (largest1 + largest2) / 2);
}