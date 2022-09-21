#11650번

#반복문으로 여러줄 입력받는 상황 시,
#시간초과 뜨니까 input 초기화시켜서 입력받기
import sys
input = sys.stdin.readline


n = int(input())

arr = []
for i in range(n):
    [a, b] = map(int,input().split())
    arr.append([a,b])

arr = sorted(arr)
#sorted 함수
#첫 번째 매개변수로 들어온 이터러블한 데이터를 새로운 정렬된 리스트로 만들어서 반환해 주는 함수
#본체 리스트는 내버려두고, 정렬한 새로운 리스트를 반환하는 것



#새로 정렬한 리스트 출력
for i in range(n):
    print(arr[i][0], arr[i][1])

