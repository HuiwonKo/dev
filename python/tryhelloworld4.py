#파트6[리스트] 파트7[for] 파트11[while]

#list
list1 = ['가위','바위','보']
list2 = [37,23,10,33,29,40]

print(list1)
print(list2)

print(list1[0]) # index는 0부터 시작
print(list1[1])
print(list1[2])
# print(list1[3]) error(list의 크기를 넘어감)

list1[0] = '바위'
print(list1[0])
print(list1)

print(list[-1]) # 뒤에서 첫 번째 값
print(list[-3]) # 뒤에서 세 번째 값
#print(list[-4])

list2.append(16) # 원소 16 을 list2 의 맨 뒤에 추가
print(list2)

list3 = list2 + [16] # 원소 16 을 list2 의 맨 뒤에 추가하여 list3 생성
print(list3)

list4 = list2 + list3 # list2의 뒤에 list3 을 append 하여 list4 생성
print(list4)

n = 12
ownership = n in list3
# list3 안에 n 이 들어있는지 여부를 확인 => True / False 로 return
print(ownership)


print(list4)
del list4[12] # index 12를 지움
print(list4)
list4.remove(40) # 원소 40을 지움
# 40이 여러 개 있어도 제일 앞에 나온 40 이 지워짐
print(list4)

"""
list의 수정

    **삽입

(list1 = [1,2,3] 이라고 할 때)
1. append 이용
list1.append(4)

2. 뒤에 새로운 리스트를 더하기
list2 = list1+[4]
list1은 그대로 두고, 새로운 리스트를 만들어 낸다



    **list에 들어있는지 확인

in 을 이용
#12라는 값이 리스트에 들어있는지 확인
n = 12
if n in list1:
    print('{}가 list에 있다'.format(n))


    **삭제

1. del 이용 (index)
del list1[10] # list의 10번째 값을 지워라

2. remove 이용 (value)
list1.remove(40) #list1 안에 40이라는 값이 있는 경우 삭제
#여러 개의 값이 있는 경우 가장 앞에 있는 하나만 지워짐

"""




# for 문
alphabet = ['a','b','c','d','e']
for pattern in alphabet:
    print(pattern)

for i in range(5):
    print(i)

names = ['a','b','c']

for i in range(len(name)):
    name = names[i]
    print('{}번: {}'.format(i+1,name))

for i,name in enumerate(names):
    print('{}번: {}'.format(i+1,name))

"""
1. for in list 문

for pattern in patterns:
    print(pattern)

리스트 patterns의 값을 하나씩 꺼내 pattern으로 전달
리스트의 길이만큼 print (pattern) 실행



2. for in range 문

**range 함수
:필요한 만큼의 숫자를 만들어내는 기능

for i in range(5):
    print(i) # 0부터 5개의 숫자 출력

**enumerate
:리스트가 있는 경우 순서와 리스트의 값을 전달하는 기능

names = ['철수', '영희', '영수']
for i, name in enumerate(names):
    print('{}번: {}'.format(i + 1, name))


**
for in list
순회할 리스트가 정해져 있을 때

for in range
순회할 횟수가 정해져 있을 때


"""

#range를 이용해서 0부터 3까지 출력되도록 완성해 보세요.
for i in range(4):
    print(i)

#range를 이용해서 무지개의 순서와 색을 출력하도록 코드를 완성해 보세요. 단, rainbow에 새로운 값이 추가되더라도 그 값을 모두 출력할 수 있도록 len을 이용해야 합니다.
rainbow=["빨","주","노","초","파","남","보"]
for i in range(len(rainbow)):
    color = rainbow[i]
    print('{}번째 색은 {}'.format(i+1,color))

#enumerate를 이용해서 무지개의 순서와 색을 출력
rainbow=["빨","주","노","초","파","남","보"]
for i,name in enumerate(rainbow):
    print('{}번째 색은 {}'.format(i+1,name))

# 1월의 날짜수는 31일 입니다.2월의 날짜수는 29일 입니다.... 위와 같은 형식으로 12월까지 출력

days = [31,29,31,30,31,30,31,31,30,31,30,31]
for i,name in enumerate(days):
    print('{}월의 날짜수는 {}일 입니다.'.format(i+1, name))

#while 문
selected = None
while selected not in ['가위','바위','보']: # not in
    selected = input('가위,바위,보 중에 선택하세요')

print('선택된 값은: ',selected)

patterns = ['가위','바위','보']
length = len(patterns)
i=0

while i < length:
    print(patterns[i])
    i = i+1

#break : 반복문 종료
#continue : 반복문의 나머지 부분을 보지 않고, 반복문의 처음으로 돌아가는 기능


list = [1,2,3,5,7,2,5]

for val in list:
    if val % 3 == 0:
        print(val)
        break

for i in range(10):
    if i%2 != 0 :
        print(i)
        print(i)
        print(i)
        print(i)

for i in range(10):
    if i%2 == 0 :
        continue #continue 써서 문장이 블럭의 너무 깊은 부분으로 들어가는 것을 방지
    print(i)
    print(i)
    print(i)
    print(i)

