/* Tries to divied by zero */
#include <stdio.h>
#include <stdlib.h>
int main()
{
	int divided = 20;
	int divisor = 0;
	int quotient;
	if (divisor ==0)
	{
		fprintf(stderr,"Division by zero! Exiting...\n");
		exit(-1);
	}
	quotient = divided/divisor;
	fprintf(stderr,"Vaule of quotient: %d\n", quotient);
	exit(0);
}