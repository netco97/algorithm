import sys
input = sys.stdin.readline

n, m = map(int, input().split())
check= True
for _ in range(m):
    num = int(input())
    book = list(map(int, input().split()))
    for j in range(num-1):
        if book[j] < book[j+1]:
            check = False
            break

if check:
    print("Yes")
else:
    print("No")