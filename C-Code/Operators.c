/* Arithmetic Operators */
#include <stdio.h>
void main()
{
	int a = 21;
	int b = 10;
	int c;
	c = a + b;
	printf("Line 1 - Value of c is done by method a + b: %d\n", c = a + b);
	printf("Line 2 - Value of c is done by method a - b: %d\n", c = a - b);
	printf("Line 3 - Value of c is done by method a * b: %d\n", c = a * b);
	printf("Line 4 - Value of c is done by method a / b: %d\n", c = a / b);
	printf("Line 5 - Value of c is done by method a %% b: %d\n",c = a % b);
	printf("Line 6 - Value of c is done by method a ++ : %d\n", c = a++);
	printf("Line 7 - Value of c is done by method a -- : %d\n", c = a--);
	printf("Line 8 - Valie of c is just default c value: %d\n", c);
}
/*
+ Adds two operands.
- Substracts second operand from the first.
* Multiplies both operands.
/ Divides numerator by de-numerator.
% Modulus operator and remainder of after an integer division.
-- Decrement operator decreases the integer value by one.
++ Increment operator increases the integer value by one.
*/


/* Relational OPerators */
/* 
#include <stdio.h>
void main()
{
	int a = 21;
	int b = 10;
	int c;
	if(a == b)
	{
		printf("Line 1 - a is equal to b \n");
	}
	else
	{
		printf("Line 1 - a is not equal to b \n");
	}
	if(a < b)
	{
		printf("Line 2 - a is less than b \n");
	}
	else
	{
		printf("Line 2 - a is not less than b \n");
	}
	if(a > b)
	{
		printf("Line 3 - a is greater than b \n");
	}
	else
	{
		printf("Line 3 - a is not greater than b \n");
	}
	/*Lets change value of a and b /
	a = 5;
	b = 20;
	if(a <= b)
	{
		printf("Line 4 - a is either less than or equal to b \n");
	}
	if(b >= a)
	{
		printf("Line5 - b is either greater than or equal to a \n");
	}
}

*/