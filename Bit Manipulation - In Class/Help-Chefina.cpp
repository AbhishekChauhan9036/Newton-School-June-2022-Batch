#include <iostream>
using namespace std;
#define int long long int
void isKthBitSet(int n, int k)
{
	if (n & (1 << (k - 1)))
		cout << "SET"<<endl;
	else
		cout << "NOT SET"<<endl;
}


int32_t main()
{
	int t;
	cin>>t;

	while(t--){
		int n,k;
		cin>>n>>k;
		isKthBitSet(n, k);
	}
	
	return 0;
}