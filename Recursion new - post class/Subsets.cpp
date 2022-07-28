#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
void func(int [],int ,int ,set<vector<int>>&);
int main() {
    int t;
    cin>>t;
    while(t--)
    {
        int n,i,pow_set;
        cin>>n;
        int arr[n];

        for(i=0;i<n;i++)

          cin>>arr[i];

          pow_set=pow(2,n);

          set<vector<int>>s;

          func(arr,n,pow_set,s);

          set<vector<int>>::iterator itr;

          cout<<"()";

          for(itr=s.begin();itr!=s.end();itr++)

          {

              vector<int>v;

              v=*itr;

              cout<<"(";

              for(i=0;i<v.size();i++)

              {

                  if(i==v.size()-1)

                  cout<<v[i];

                  else

                  cout<<v[i]<<" ";
              }
              cout<<")";
          }
          cout<<endl;
    }
    return 0;
}

 void func(int arr[],int n,int pow_set,set<vector<int>>&s)

 {

     int i,j;

     vector<int>v;

     for(i=0;i<pow_set;i++)

     {

         v.clear();

         for(j=0;j<n;j++)

         {

             if(i & 1<<j)

             v.push_back(arr[j]);

         }

         sort(v.begin(),v.end());

         if(i!=0)

         s.insert(v);

     }

 }