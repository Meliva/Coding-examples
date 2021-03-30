#include <iostream>
#include <cstring>
using namespace std;
int main()
{
	char key[25], buffer[25];
	cout << "Enter the key string: ";
	cin.getline(key, 25);
	strcpy(key, buffer);
	cout << "Key = " << key << endl;
	cout << "Buffer = " << buffer << endl;
	return 0;
}
//Use C++ compiler online for this to work
//Does not seem to print