#include <bits/stdc++.h>
 using namespace std;
 #define sd(x) scanf("%d", &x)
 #define sz(v) (int) v.size()
 #define pr(v) For(i, 0, sz(v)) {cout<<v[i]<<" ";} cout<<endl;
 #define slld(x) scanf("%lld", &x)
 #define all(x) x.begin(), x.end()
 #define For(i, st, en) for(int i=st; i<en; i++)
 #define tr(x) for(auto it=x.begin(); it!=x.end(); it++)
 #define fast std::ios::sync_with_stdio(false);cin.tie(NULL);
 #define pb push_back
 #define chauhan_abhishek main
 #define ll long long
 #define ld long double
 #define double long double
 #define mp make_pair
 #define F first
 #define S second
 typedef pair<int, int> pii;
 typedef vector<int> vi;
 #define pi 3.141592653589793238
 const int MOD = 1e9+7;
 
 
 const int N = 2e5+5;
 
 
 
 int pre[N][55], suf[N][55];
 int arr[N];
 
 void solve(){
     int n; cin>>n;
     For(i, 1, n+1){
         cin>>arr[i];
     }
     For(i, 1, n+1){
         For(j, 1, 51){
             if(arr[i]==j)
                 pre[i][j]=i;
             else
                 pre[i][j]=pre[i-1][j];
         }
     }
     for(int i=n; i>=1; i--){
         For(j, 1, 51){
             if(arr[i]==j){
                 suf[i][j]=i;
             }
             else{
                 suf[i][j]=suf[i+1][j];
             }
         }
     }
     vector<int> ans(n+1, -1);
     For(i, 1, n+1){
         int dist = 3e5;
         For(j, 1, 51){
             if(__gcd(arr[i], j)==1){
                 if(pre[i][j] && abs(i-pre[i][j])<=dist){
                     ans[i]=pre[i][j];
                     dist=abs(i-pre[i][j]);
                 }
                 if(suf[i][j] && abs(i-suf[i][j])<dist){
                     ans[i]=suf[i][j];
                     dist=abs(i-suf[i][j]);
                 }
             }
         }
     }
     set<int> s;
     For(i, 1, n+1){
         s.insert(ans[i]);
         cout<<ans[i]<<" ";
     }
 }
 
 
 signed chauhan_abhishek()
 {
         solve();
 }