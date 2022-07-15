#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int cntBits(vector<int> &A) {
    int n = A.size();
    int ans = 0;
    for(int i=0;i<31;i++) {
        long long z = 0,o = 0;
        for(int j=0;j<n;j++) {
            if( ((A[j]>>i)&1 ) == 1 ) o++;
            else z++;
        }
        ans  = ( ans + (z*o)%1000000007 )%1000000007;
    }
    return (2*ans)%1000000007;
}

int main() {

	int n;
	cin>>n;
	vector<int> arr;
    int v;
  for(int i=0 ; i<n ; i++){
	  cin>>v;
    arr.push_back(v);
  }
   cout<<cntBits(arr);
   
	return 0;
}