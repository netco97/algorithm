import random

N = int(input());

for i in range(N):
    A_NUM = random.randrange(1,6)
    A_arr = []
    B_NUM = random.randrange(1,6)
    B_arr = []
    for j in range(A_NUM):
        ran_num = random.randrange(1,5)
        A_arr.append(ran_num)
    for k in range(B_NUM):
        ran_num = random.randrange(1,5)
        B_arr.append(ran_num)

    for i in range(4,0,-1):
        if A_arr.count(i) > B_arr.count(i):
            print("A")
            break
        elif A_arr.count(i) < B_arr.count(i):
            print("B")
            break
        if i == 1:
            print("D")

    print("A", A_NUM, end=" ")
    print(" ".join(map(str,A_arr)))
    print("B" ,B_NUM, end=" ")
    print(" ".join(map(str,B_arr)))
