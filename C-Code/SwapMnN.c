/* Reads two integers M and N and to swap their values, Use a user-defeined function for swapping. Output the values of M and N before and after swapping */
#include <stdio.h>
void swap(float *ptr1, float *ptr2);
void main()
{
	float m, n;
	printf("Enter the values of M and N \n");
	scanf("%f %f", &m, &n);
	printf("Before Swapping:M = %5.2f N = %5.2f\n", m, n);
	swap(&m, &n);
	printf("After Swapping:M = %5.2f N = %5.2f\n", m, n);
}
/*Function that swaps the two integers*/
void swap(float *ptr1, float *ptr2)
{
	float temp;
	temp = *ptr1;
	*ptr1 = *ptr2;
	*ptr2 = temp;
}