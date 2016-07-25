#파트8[모듈] 파트9[활용하기] 파트10[딕셔너리와 튜플] 파트12[예외처리]

for i in range(0,10): #range (a,b) a이상 b미만
    print(i)
#모듈
"""
미리 만들어진 코드를 가져와 쓰는 방법

import 모듈이름
사용 방법: 모듈이름.모듈안의 구성요소

math.pi
random.choice()

모듈의 예
import math
수학과 관련된 기능

import ramdom
무작위와 관련된 기능

import urllib.request
인터넷의 내용을 가져오는 기능

"""
import math

print(math.pi)
print(math.ceil(2.5))
print(math.floor(2.5))

import random

candidates = ['a','b','c']
print(random.choice(candidates))

def get_web(url):

    import urllib.request
    response = urllib.request.urlopen(url)
    data = response.read()
    decoded = data.decode('utf-8')
    return decoded

url = input('웹 페이지의 주소?')
content = get_web(url)
print(content)

#모듈 만들기

def random_rsp():
    import random
    return random.choice(['가위','바위','보'])
#moduleA.py

#다른 파일에서 쓰고자 할 때
selected = moduleA.random_rsp()

#사용자가 만든 모듈과 모듈을 쓸 파일이 같은 폴더에 들어있어야 한다.

#공식 문서의 예제 코드
#site:stackoverflow.com
#site:python.org



#딕셔너리

"""
여러 값을 저장해 두고 필요한 값을 꺼내 쓰는 기능
이름표를 이용하여 값을 꺼내 사용
사용할 때는 리스트와 비슷한 방식

"""

wintable = {'가위':'보','바위':'가위','보':'바위'} # 이름표 : 값
print(wintable['가위'])

def rsp(mine,yours):
    if mine == yours :
        return 'draw'
    elif wintable[mine] == yours:
        return 'win'
    else:
        return 'lose'
result = rsp('가위','바위')
print(result)

messages = {'win':'이겼다','lose':'졌다','draw':'비겼다'}
dict = {"이름표":[1,2,3]}
#이름표는 문자열 또는 숫자를 주로 사용하지만 값은 리스트를 포함해서 무엇이든 올 수 있음.

dict["이름표"] = [1,2]

del(dict["이름표"])
# dict.pop("이름표")


"""
딕셔너리

**추가
dict['three'] = 3

(list의 경우 그냥 추가하면 안되고 append 이용
list[3] = 3 불가 )


**수정
dict['one'] = 11


**삭제
del(dict['one'])
dict.pop('two') # pop은 삭제와 동시에 값을 반환

"""


season = ['봄','여름','가을','겨울']

for season in seasons :
    print(season)

ages = {'Tod':35, 'Jane':23, 'Paul':62}
# key : value

#딕셔너리의 함수 : keys() , values() , items()

for key in ages.keys(): # for key in ages: 로 써도 key를 받아옴
    print(key)

for value in ages.values():
    print(value)

for key,value in ages.items():
    print(key,value)


"""
리스트 / 딕셔너리 의 비교

list = [1,2,3,4,5]
dict = {'one':1, 'two':2}

del(list[0])
del(dict['one'])

len(list)
len(dict)

2 in list
'two' in dict.keys()

2 in list
2 in dict.values()

list.clear
dict.clear # list,dict 지우기

dict는 key로 값을 가져옴

"""

big_list = [1,2,3]+[4,5,6]
print(big_list)

dict1 = {1:200,2:300}
dict2 = {1:1000,3:300}

dict1.update(dict2)





"""
공통점
              List                        Dictionary
생성      list = [ 1, 2 ,3 ]    dict = { 'one':1, 'two':2 }
호출      list[ 0 ]             dict[ 'one' ]
삭제      del( list[ 0 ] )      del( dict[ 'one' ] )
개수 확인 len( list )           len( dict )
값 확인   2 in list             two' in dict.keys( )
전부 삭제 list.clear( )         dict.clear( )


차이점
1.순서
List  : 삭제 시 순서가 바뀌기 때문에 인덱스에 대한 값이 바뀐다
Dictionary : key로 값을 가져오기 때문에 삭제 여부와 상관없다
2.결합
List : list1 + list2
Dictionary : dict1.update( dict2 )

"""

#튜플

"""
한번 정해진 순서를 바꿀 수 없음
값의 변경과 삭제가 불가능



튜플을 이용하면 값을 여러 개 넣을 수 있다
a = (3,4)

packing : 하나의 변수에 값을 여러 개 넣는 것
unpacking : 패킹된 변수에서 여러 개의 값을 꺼내오는 것
"""

tuple1 = (1,2,3)
tuple2 = 1,2,3,4 #괄호 안쓸 수도 있음

list1 = [1,2,3]
tuple3 = tuple(list1) #list -> tuple로 변환 가능
# tuple3[0] = 4 #값 변경 불가

a,b = 1,2
# a = 1, b = 2 튜플 생성 (a,b) (1,2)

c = (3, 4)
d, e = c    # c의 값을 언패킹하여 d, e에 값을 넣었다
f = d, e    # 변수 d와 e를 f에 패킹

list = [1,2,3,4,5]
for i,v in enumerate(list): #i,v 는 튜플
    print(i,v)

for a in enumerate(list):
    print(a[0],a[1])

for a in enumerate(list):
    print('{}번째 값 {}'.format(*a)) # *a 는 튜플을 쪼개라는 의미

ages = {'Tod':35,'Jane':23,'Paul':62}
for a in ages.items():
    print('{}의 나이는 {}'.format(*a))


#예외 처리

"""
try:
   # 에러가 발생할 가능성이 있는 코드
except Exception: # 에러 종류
   # 에러가 발생했을 경우 처리할 코드


* 예외 이름을 모르는 경우 *
try:
    # 에러가 발생할 가능성이 있는 코드
except Exception as ex: # 에러 종류
    print('에러가 발생 했습니다', ex) # ex는 발생한 에러의 이름을 받아오는 변수

"""


text = '100%'
try :
    number = int(text)

except ValueError:
    print('{}는 숫자가 아니에요'.format(number))


def safe_pop_print(list,index):
    try:
        print(list.pop(index))
    except IndexError:
        print('{}의 index 값을 가져올 수 없습니다.'.format(index))

safe_pop_print([1,2,3],5)
try :
    import i_module
except ImportError:
    print('모듈이 없습니다')


try:
    list = []
    print(list[0])

    text = 'ab'
    number = int(text)
except: # 어떤 에러인지 알 수 없을 경우
    print('에러가 발생합니다')

try:
    list = []
    print(list[0])

    text = 'ab'
    number = int(text)
except Exception as ex: # 어떤 에러인지 알 수 없을 경우 -> 에러명을 출력할 수 있음
    print(ex,'에러가 발생합니다')

"""
사용자가 직접 에러를 발생시키는 기능
raise Exception # 에러 종류 #에러를 발생시킬 위치
많이 사용하면 코드를 읽기 어려워진다.

"""

def rsp(mine,yours):
    allowed = ['가위','바위','보']
    #가위바위보 승패를 판단하는 코드
    if mine not in allowed:
            raise ValueError
    if yours not in allowed:
            raise ValueError

try:
    rsp('가위','바')

except ValueError:
    print('잘못된 값을 넣었습니다.')

school = {'1반':[172,180,175,190],'2반':[180,178,182,188]}
try:
for class_number,students in school.items():
    for student in students:
        if students>190:
                print(class_number,'번에 190을 넘는 학생이 있습니다.')
                raise StopIteration
except StopIteration:
    print("정상 종료")



value = "가"
try:
    if value not in ['가위','바위','보']:
        raise ValueError("가위 바위 보 중 하나의 값이어야 합니다")
except ValueError:
    print("에러가 발생했습니다.")

