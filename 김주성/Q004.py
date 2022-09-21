n, m = map(int, input().split())
# 배열 저장 공간
A = [[0] * (n+1)]
D = [[0] * (n+1) for _ in range(n+1)]

# 배열 A 입력 받기
for i in range(4):
  A_row = [0] + [int(x) for x in input().split()]
  A.append(A_row)

# 구간합 배열 D 구하기
for i in range(1, n+1):
  for j in range(1, n+1):
    D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j]

for _ in range(m):
  x1, y1, x2, y2 = map(int, input().split())
  result = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1]
  print(result)