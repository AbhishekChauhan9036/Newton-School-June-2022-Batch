#include<bits/stdc++.h>
# define lli long long int
# define pb push_back
# define ff first
#define ss second
using namespace std;
void fast(){
	ios_base::sync_with_stdio(0);cin.tie(0); cout.tie(0);
}
int main()
{
     fast();
     int t=1;
     while(t--)
     {
          
          lli n,i,j,c=0,ansx=0,ansy=0,x,y;
          cin>>n;
          n=4ll*n+1ll;
          map<lli,lli> mpx;
          map<lli,lli> mpy;
          for(i=0;i<n;i++)
          {
               cin>>x>>y;
               mpx[x]++;
               mpy[y]++;
          }
          for (auto itr = mpx.begin(); itr != mpx.end(); ++itr)
          {
               x=itr->ss;
               if(x%2==0)
               continue;
               else
               {
                    ansx=itr->ff;
                    break;
               }
          }
          for(auto itr1 = mpy.begin(); itr1 != mpy.end(); ++itr1)
          {
               y=itr1->ss;
               if(y%2==0)
               continue;
               else
               {
                    ansy=itr1->ff;
                    break;
               }
          }
          cout<<ansx<<" "<<ansy<<endl;
     }
     return 0;
}