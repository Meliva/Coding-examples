#include <iostream>
using namespace std;
int main()
{
	int test[3][3]; //Declaration 2D array
	test[0][0] = 5; //Initialization
	test[0][1] = 10;
	test[0][2] = 0;
	test[1][0] = 0;
	test[1][1] = 15;
	test[1][2] = 20;
	test[2][0] = 30;
	test[2][1] = 0;
	test[2][2] = 10;
	//traversal
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			cout << test[i][j] << " ";
		}
		cout << "\n";//new line at each row
	}
	return 0;
}