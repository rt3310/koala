n = int(input())

numbers = set()
for _ in range(n):
    numbers.add(int(input()))

for i in sorted(numbers):
    print(i)