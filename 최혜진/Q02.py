n = int(input("갯수입력:"))
a = list(map(int, input("성적입력:").split()))
max = max(a)

result = []
for i in a :
  result.append(i / max * 100)

print(sum(result) / n)