# 2018번 : 수들의 합 5
import sys
n = int(sys.stdin.readline())
start, end = 0, 0
cnt, tmp = 0, 0

while end <= n:
    if tmp < n:
        end += 1
        tmp += end
    elif tmp > n:
        tmp -= start
        start += 1
    else:
        cnt += 1
        end += 1
        tmp += end
print(cnt)