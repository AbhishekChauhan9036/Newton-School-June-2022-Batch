#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int checkPrimeNumber(int n) {
  int j, flag = 1;

  for (j = 2; j <= n / 2; ++j) {

    if (n % j == 0) {
      flag = 0;
      break;
    }
  }

  return flag;
}
int main() {

  int n1, n2, i, flag;
  scanf("%d %d", &n1, &n2);

  if (n1 > n2) {
    n1 = n1 + n2;
    n2 = n1 - n2;
    n1 = n1 - n2;
  }
	int ans=0;
  for (i = n1 + 1; i < n2; ++i) {
    flag = checkPrimeNumber(i);

    if (flag == 1) {
      ans++;
    }
  }

  cout<<ans<<endl;
  
  return 0;
}