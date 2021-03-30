/* Swaps contents of two numbers using bitwise XOR operation. Don't use either the temporary variable or arithmetic operators */
#include <stdio.h>
void main()
{
	long i, k;
	printf("Enter two integers \n");
	scanf("%d %d", &i, &k);
	printf("\n Before swapping i = %d and k = %d", i, k);
	i = i ^ k;
	k = i ^ k;
	i = i ^ k;
	printf("\n After swapping i = %d and k = %d", i, k);
}