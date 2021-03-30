/* C program to find the lenth of a string without using the built-in function */
#include <stdio.h>
void main()
{
	char string[50];
	int i, length = 0;
	printf("Enter a string \n");
	gets(string);
	/*Keep going through each character of the string till its end */
	for (i=0; string[i] != '\0'; i++)
	{
		length++;
	}
	printf("The length of a string is the number of characters in it \n");
	printf("So, the length of %s = %d\n", string, length);
}