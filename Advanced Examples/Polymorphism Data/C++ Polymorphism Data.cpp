#include <iostream>
#include <string>
using namespace std;
class Animal
{
public:
	string colour = "Black";
};
class Dog : public Animal
{
public:
	string colour = "Grey";
};
int main(void)
{
	Animal d = Dog();
	cout << d.colour;
}