#include <bits/stdc++.h>
//ls cd gpppp
using namespace std;

int greyConverter(int n) { return n ^ (n >> 1); }

int main()
{
	int t;
	cin>>t;

	while(t--){
	int n;
	cin>>n;
	cout << greyConverter(n) << endl;
	}

	return 0;
}