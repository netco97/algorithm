n,m = map(int,input().split(" "))

str = []

for i in range(n):
    str.append(input())

for i in range(n-1):
    str1 = str[i]
    str2 = str[i+1]

    check = False

    for j in range(1,m+1):
        if str1[m-j:] == str2[:j]:
            check = True
            print("a")
        if str1[:j] == str2[m-j:]:
            check = True
            print("b")

    if check==False:
        print(0)
        exit(0)

print("1")

