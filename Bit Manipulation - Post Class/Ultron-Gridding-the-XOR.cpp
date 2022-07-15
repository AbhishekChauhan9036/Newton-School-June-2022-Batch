#include<bits/stdc++.h>
using namespace std;
long long f(long long r, long long c, int i) {
r += (1ll << 62) - (1ll << i) + 1;
c += (1ll << i);
if (r & c) return (1ll << i);
return 0;
}
int main() {
long long r1, r2, c1, c2;
scanf("%lld %lld %lld %lld"
, &r1, &r2, &c1, &c2);
r1--;
c1--;
long long ans = 0;
for (int i = 0; i < 60; i++) {
ans ^= f(r2, c2, i);
ans ^= f(r1, c2, i);
ans ^= f(r2, c1, i);
ans ^= f(r1, c1, i);
}
printf("%lld\n"
, ans);
return 0;
}