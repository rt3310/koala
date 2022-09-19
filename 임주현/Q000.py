n1 = int(input()) #개수 입력

n = 0
temp = 0
k1 = []

for i in range(0,n1): # n1개수만큼 값 입력
    n = int(input())
    k1.append(n) # k1리스트에 n값 추가

for j in range(1,n1):
    for k in range(j,n1,1):
        if (k1[j-1]>k1[k]):
            temp = k1[j-1]
            k1[j-1] = k1[k]
            k1[k] = temp

for k in range(n1):
    print(k1[k])




