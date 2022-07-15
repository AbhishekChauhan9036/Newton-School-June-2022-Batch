#include<iostream>
using namespace std;

int gma(long long int n)
{
    if(n==0){return 0;}
    else if(n==1){return 1;}
    
    long long int a=1;
    
    while(a*2 <= n)
    {
        a = a*2;
    }
    return 1+gma(n-a);
}

int main()
{
    long long int n;
    cin>>n;
    
    int ans = gma(n);
    cout<<ans<<endl;
}