/* Reverse the string using recursion */
#include <stdio.h>
#include <string.h>
void reverse(char [], int, int);
int main()
{
	char string1[20];
	int size;
	printf("Enter a string to reverse: ");
	scanf("%s", string1);
	size = strlen(string1);
	reverse(string1, 0, size-1);
	printf("The string after reversing is: %s\n", string1);
	return 0;
}
void reverse(char string1[], int index, int size)
{
	char temp;
	temp = string1[index];
	string1[index] = string1[size - index];
	string1[size - index] = temp;
	if(index == size/2)
	{
		return;
	}
	reverse(string1, index+1, size);
}