#include <bits/stdc++.h>
using namespace std;
#define int long long int
int singlenumber(int a[],int N)
{
	unordered_map<int,int>fmap;
	for(int i = 0; i < N;i++)
	{
		fmap[a[i]]++;
	}

	for(auto it:fmap)
	{
	
		if(it.second == 1)
		{
			return it.first;
		}
	}
}

int32_t main()
{
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	cout << singlenumber(arr,n);
	return 0;
}