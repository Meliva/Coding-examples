#include <iostream>
#include <string>
using namespace std;
class Student
{
public:
	int id;
	//data member (also instance variable)
	string name;
	//data member (also instance variable)
};
int main()
{
	Student S1; //Creating an object of student
	S1.id = 201;
	S1.name = "Sonoo Jaiswal";
	cout << S1.id << endl;
	cout << S1.name << endl;
	return 0;
}