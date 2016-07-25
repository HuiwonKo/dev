#파트3[조건문]


#조건문 : if 문
people = 3
apple = 20

if people > apple:
    print('사람이 너무 많아! 몇 명은 못 먹겠네')
#들여쓰기 안하면 실행되지 않음

if True:
    print("조건식이 True 이면 실행됩니다.")

if False:
    print("조건식이 False 이면 실행되지 않습니다.")

if hour%6 == 0: #시간이 6의 배수일 때만
    print('종이 울립니다.')

"""
if 조건식 :
    #들여쓰기된 코드




같다 ==
같지 않다 !=

Boolean 연산
참 True
거짓 False

and / or / not

"""

#블럭
if True:
    print('블럭에 속한 코드') #들여쓰기를 '블럭'이라고 부름
    print('들여쓰기')
    print('들여쓰기가 어긋나면 안돼.')

    if True:
        print('참')

    if False:
        print('거짓')

    print('여기까지가 True 블럭')

print('if 블럭 끝')

if False:
        print('조건이 안 맞는 코드')

        if True:
            print('조건이 맞는 코드')

            if True:
                print('블럭 하나 더')

        print('어쨌든 실행되지 않는 코드')

print('다시 바깥에 있는 코드')


"""
블럭: 함께 실행되는 하나의 코드 덩어리
들여쓰기로 블럭을 구분한다.
들여쓰기가 어긋나면 오류가 발생한다.
블럭 안에 다른 블럭이 들어갈 수 있다.
내부의 블럭은 외부의 블럭에 종속적.
(외부의 블럭이 실행되어야 내부의 블럭이 실행될 수 있는 구조)
파이썬 코드 전체를 하나의 블럭으로 볼 수 있다.

"""

#조건문 : if-else 문


SCISSOR = '가위'
ROCK = '바위'
PAPER = '보'


WIN = '이겼다'
DRAW = '비겼다'
LOSE = '졌다'

mine = '가위'
yours = '바위'

if mine == yours:
    result = DRAW

else:
    if mine == SCISSOR:
        if yours == ROCK:
            result = LOSE
        else:
            result = WIN

    elif mine == ROCK:
        if yours == PAPER:
            result = LOSE
        else:
            result = WIN

    elif mine == PAPER:
        if yours == SCISSOR:
            result = LOSE
        else:
            result = WIN

    else:
        print('이상해요')

print(result)

"""
#if-else

if True:
    pass # 조건이 참일 때 실행

else :
    pass # 조건이 거짓일 때 실행


#if-elif-else

if True:
    pass # 조건이 참일 때 실행

elif False:
    pass # 다른 조건이 참일 때 실행

else:
    pass # 조건이 거짓일 때 실행


요약.
if else 문은 C언어에서와 똑같이 쓰되,
C언어에서의 else if 문은 python에서의 elif 와 같다.
"""