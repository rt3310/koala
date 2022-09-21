#11659번
#누적 합 알고리즘을 통해 구간 합을 출력
#pfs[j]-pfs[i-1]사용


from sys import stdin

n,m = map(int, input("배열크기, 질의갯수:").split())
pfs = list(map(int, input("숫자입력:").split()))
pfs_sum = [0]

#합배열
sum = 0
for i in pfs:
    sum += i
    pfs_sum.append(sum)

#구간합 출력
for n in range(m):
    i, j = map(int, stdin.readline().split())
    print(pfs_sum[j] - pfs_sum[i-1])

