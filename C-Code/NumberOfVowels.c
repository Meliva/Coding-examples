/* Reads a sentence and count the total number of vowels and consonants in the sentence. */
#include <stdio.h>
void main()
{
	char sentence[80];
	int i, vowles=0, consonants=0, specail=0;
	printf("Enter a sentence \n");
	gets(sentence);
	for(i=0; sentence[i] != '\0'; i++)
	{
		if((sentence[i] == 'a' || sentence[i] == 'e' || sentence[i] == 'i' || sentence[i] == 'o' || sentence[i] == 'u') || (sentence[i] == 'A' || sentence[i] == 'E' || sentence[i] == 'I' || sentence[i] == 'O' || sentence[i] == 'U'))
		{
			vowles = vowles + 1;
		}
		else
		{
			consonants = consonants + 1;
		}
		if(sentence[i] == 't' || sentence[i] == '\0' || sentence[i] == ' ')
		{
			specail = specail + 1;
		}
	}
	consonants = consonants - specail;
	printf("No. of vowels in %s = %d\n", sentence, vowles);
	printf("No. of consonants in %s = %d\n", sentence, consonants);
}