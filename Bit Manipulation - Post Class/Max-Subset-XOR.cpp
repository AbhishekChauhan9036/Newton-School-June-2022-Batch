#include<bits/stdc++.h>
using namespace std;
class Solution
{
    public:
    int maxSubarrayXOR(int arr[], int N)
    {
        if(N == 0) return 0;
int x = 0;
while(1)
{
  int y = *max_element(arr,arr+N);
  if(y == 0) return x;
  x = max(x,x^y);
  for(int i=0;i<N;i++)
  {
    arr[i] = min(arr[i],arr[i]^y);
  }
}
    }
};

int main()
{

    int t,n,a[100004],k;

       scanf("%d",&n);
        for(int i=0;i<n;i++)
        {
            scanf("%d",&a[i]);
        }
        Solution obj;
        printf("%d\n",obj.maxSubarrayXOR(a,n));
}