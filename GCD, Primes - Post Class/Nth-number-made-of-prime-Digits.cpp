#include<bits/stdc++.h>
using namespace std;
class Solution
{
    public:
    int primeDigits(int n)
    {
        queue<int>q;
        q.push(0);
        for(int i=0;i<=n;)
        {
            int res=q.front();
            q.pop();
             i++;
            q.push((res*10)+2);
            if(i==n)break;
            i++;
            q.push((res*10)+3);
            if(i==n)break;
            i++;
            q.push((res*10)+5);
            if(i==n)break;
            i++;
            q.push((res*10)+7);
            if(i==n)break;
            
        }
        return q.back();
    }
};

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        Solution ob;
        cout << ob.primeDigits(n) << "\n";   
    }
}