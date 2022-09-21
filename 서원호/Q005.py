n, m = map(int, input().split())
numbers = list(map(int, input().split()))
sums = []
remains = []
remain_cnt = [0] * m

total = 0
for i in numbers:
    total += i
    sums.append(total)

for i in sums:
    remains.append(i % m)

answer = 0
for i in remains:
    remain_cnt[i] += 1
    if i == 0:
        answer += 1

remain_cnt = list(map(lambda x: x*(x-1)//2, remain_cnt))
answer += sum(remain_cnt)

print(answer)