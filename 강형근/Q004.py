# 11650번 : 좌표 정렬하기
import sys
n = int(sys.stdin.readline())
res = []
for _ in range(n):
    a, b = map(int, sys.stdin.readline().split())
    res.append([a, b])
res.sort()
for i in res:
    print(*i)

# https://www.acmicpc.net/source/49475912