N, M = map(int, input().split())  # numbers 길이, 구간 합 구하는 횟수
numbers = list(map(int, input().split()))
sum_list = [0]  # 구간 합 배열(저장), 0번 인덱스의 구간합 값은 0

# 구간 합 배열 구하기
sum = 0
for i in range(N):
    sum += numbers[i]
    sum_list.append(sum)

print(sum_list)

for _ in range(M):
    s, e = map(int, input().split())
    result = sum_list[e] - sum_list[s-1]
    print(result)