/* To read and english sentence and replace lowercase characters by uppercase and vice-versa. Output the given sentence as well as the convered sentence on two different lines. */
#include <stdio.h>
#include <ctype.h>
void main()
{
	char sentence[100];
	int count, ch, i;
	printf("Enter a sentence \n");
	for (i=0;(sentence[i]=getchar())!='\n';i++)
	{
		;
	}
	sentence[i]='\0';
	/*shows the number of chars accepted in a semtemce */
	count = i;
	printf("The given sentence is : %s ", sentence);
	printf("\nCase changed senetence is : ");
	for(i=0;i<count;i++)
	{
		ch=islower(sentence[i])?toupper(sentence[i]):tolower(sentence[i]);
		putchar(ch);
	}
}