# given = int(input());
# for i in range(given):
#     a, b = input().split();
#     a = int(a);
#     b = int(b);
#     print(a+b);

import sys

given = int(sys.stdin.readline())
for x in range(given):
    a,b = map(int, sys.stdin.readline().split())
    print(a+b)