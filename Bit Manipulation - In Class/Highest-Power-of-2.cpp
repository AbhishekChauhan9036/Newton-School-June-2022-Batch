#include <iostream>
using namespace std;
#define int long long int
int highestPowerof2(int x)
{
	x |= x >> 1;
	x |= x >> 2;
	x |= x >> 4;
	x |= x >> 8;
	x |= x >> 16;
	return x ^ (x >> 1);
}

int32_t main()
{

	int n;
	cin>>n;
	cout << highestPowerof2(n);

	return 0;
}