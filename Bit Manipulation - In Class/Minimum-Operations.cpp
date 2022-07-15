#include <bits/stdc++.h>
using namespace std;

int minimumOneBitOperations(int n, int res = 0)
{
	if (n == 0)
		return res;

	int b = 1;
	while ((b << 1) <= n)
		b = b << 1;

	return minimumOneBitOperations(
		(b >> 1) ^ b ^ n, res + b);
}

int main()
{
	int N;
	cin>>N;

	cout << minimumOneBitOperations(N);

	return 0;
}