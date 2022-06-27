/* Author = Chauhan Abhishek */
/* Codechef Id = abhishekchauha */
/* Codeforces Id = abhishekchauhan903 */
/* GitHub Id = AbhishekChauhan9036 */
/* Language = C++ */
/* Address = Ballia,UP,INDIA (221716)*/

/******************************************************************************************************************************************/
/***********Start****************/
#include <bits/stdc++.h>
#include <chrono>
#include <random>
#define ll long long int
#define ull unsigned long long int
#define pb push_back
#define mp make_pair
#define mod 1000000007
#define rep(i,n) for(ll i=0;i<n;i++)
#define loop(i,a,b) for(ll i=a;i<=b;i++)
#define vi vector <int>
#define vs vector <string>
#define vc vector <char>
#define vl vector <ll>
#define all(c) (c).begin(),(c).end()
#define max3(a,b,c) max(max(a,b),c)
#define min3(a,b,c) min(min(a,b),c)
#define deb(x) cerr<<#x<<' '<<'='<<' '<<x<<'\n'
using namespace std;
#include <ext/pb_ds/assoc_container.hpp> 
#include <ext/pb_ds/tree_policy.hpp> 
using namespace __gnu_pbds; 
#define ordered_set tree<int, null_type,less<int>, rb_tree_tag,tree_order_statistics_node_update>
typedef vector<vector<ll>> matrix;
ll power(ll a,ll b) {ll res=1;a%=mod; assert(b>=0); for(;b;b>>=1){if(b&1)res=res*a%mod;a=a*a%mod;}return res;}
ll modInverse(ll a){return power(a,mod-2);}
const int N=500023;
bool vis[N];
vector <int> bdj[N];
/***********check krne ke liye****************/
void _hello(){
    cout<<"Hello"<<endl;
}
/***********YES print ke liye****************/
void _yes(){
    cout<<"YES"<<endl;
}

/***********NO print ke liye****************/
void _no(){
    cout<<"NO"<<endl;
}
/******************************************************************************************************************************************/
/***********my main function****************/

void Bhagwat_Geeta(){
    int _,__,_1,_2,_3,_4;
    cin>>_;
    cout<<_*_<<endl;


}

int32_t main() {
  ios::sync_with_stdio(false);
  cin.tie(0);
  int Krishna=1;
//   cin>>Krishna;
  while(Krishna--){
      Bhagwat_Geeta();
  }
  return 0;
}
/******************************************************************************************************************************************/
/***********End****************/