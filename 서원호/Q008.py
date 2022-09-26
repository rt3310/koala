n = int(input())
arr = list(map(int, input().split()))

arr.sort()

count = 0
for i, v in enumerate(arr):
    if i > 1:
        left = 0
        right = i-1
        while right > left:
            if arr[left] + arr[right] < v:
                left += 1
            elif arr[left] + arr[right] > v:
                right -= 1
            else:
                count += 1
                break
            
print(count)