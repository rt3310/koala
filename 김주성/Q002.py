def average(scores):
  return sum(scores) / len(scores)

N = int(input())

scores = list(map(int, input().split()))

M = max(scores)

new_scores = [(score / M) * 100 for score in scores]

print(average(new_scores))