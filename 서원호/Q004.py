pos = []
for i in range(int(input())):
    pos.append(list(map(int, input().split())))
    
for i in sorted(pos):
    print(i[0], i[1])