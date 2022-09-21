n = int(input())

count = 0

a = 1
b = 2
while a <= n or b <= n:
    if (n-a) % (a*2) == 0:
        i = 0
        total = a
        while a-i > 0 and a+i <= n and total <= n:
            if total == n:
                count += 1
                break
            i += 1
            total += a-i + a+i
    if b < n and n % (a + b) == 0:
        i = 0
        total = a + b
        while a-i > 0 and b+i <= n and total <= n:
            if total == n:
                count += 1
                break
            i += 1
            total += a-i + b+i
    a += 1
    b += 1

print(count)