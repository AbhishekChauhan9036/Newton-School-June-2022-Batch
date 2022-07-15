#include <bits/stdc++.h>
using namespace std;
#define int long long int
void Solve(int n)
{
	if (n > 1)
		Solve(n / 2);

	cout << n % 2;
}

int32_t main()
{
	int n;
	cin>>n;
	Solve(n);
	return 0;
}