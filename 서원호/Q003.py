import sys

n, m = sys.stdin.readline().split()
numbers = list(map(int, sys.stdin.readline().split()))
total = 0
sums = [0]
for i in numbers:
    total += i
    sums.append(total)

for _ in range(int(m)):
    start, end = map(int, sys.stdin.readline().split())
    print(sums[end]-sums[start-1])