from operator import le


n = int(input())
m = int(input())
arr = list(map(int, input().split()))
arr.sort()

count = 0
left = 0
right = len(arr) - 1
while right > left:
    if arr[left] + arr[right] < m:
        left += 1
        continue
    if arr[left] + arr[right] > m:
        right -= 1
        continue
    count += 1
    left += 1
    right -= 1
    
print(count)