n = int(input())
number = list(map(int, input().split()))
maxi = max(number)
print(sum(map(lambda x: x/maxi*100, number)) / n)