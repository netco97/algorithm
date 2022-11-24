N = int(input())

if N<=28:
    c, i = 0, 1
    while N > c:
        c += i
        i += 1
    print(i-1)

else:
    print((N-29)// 7 + 8)