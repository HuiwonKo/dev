#파트4[함수] 파트5[자료형]

#함수

"""
함수
함수는 코드의 덩어리에 이름을 붙인 것이다
print는 미리 만들어진 함수
들여쓰기에 유의

**함수의 형식

def function():
    실행할 코드

"""

a = 5
b = 7

def add(a,b):
    result = a + b
    print(result)
add(a,b)


"""
매개변수
:함수를 정의할 때 사용하는 이름

실행인자
:함수를 실행할 때 넘기는 변수,값

매개변수와 실행인자
-매개변수와 실행인자의 갯수는 동일해야

"""

def print_round(number):    # 함수의 정의
    rounded = round(number)
    print(rounded)

print_round(4.6)        # 함수의 호출
print_round(2.2)

def add_10(value): #매개변수
    result = value + 10
    return result, result+1 #return 하는 순간 함수가 종료
    result = value - 10
    return result

n = add_10(5) #실행인자
print(n)


"""
함수에서는 return 을 이용해서 값을 반환
함수를 사용하는 것은 함수 안의 코드를 모두 실행한 뒤 이 함수의 자리에 return에 있는 값을 넣은 것과 같음

return 시 여러 값 반환 가능(쉼표로 구분)

"""
#format
number = 20
greeting = '안녕하세요'
place = '문자열 포맷의 세계'
welcome = '환영합니다'

#old way
print(number,'번 손님',greeting,'.',place,'에 오신 것을',welcome,'!')

#문자열의 format 함수 이용
base = '{}번 손님, {}. {}에 오신 것을 {}'
new_way = base.format(number,greeting,place,welcome)

print(base)
print(new_way)

mine = '가위'
yours = '바위'
result = '졌다...'

print('나는 {}, 너는 {}, 그래서 {}'.format(mine,yours,result))

"""
문자열.format()
문자열의 대괄호 자리에 format 뒤의 괄호 안에 들어있는 값을 하나씩 넣는다
문자열에 포함된 대괄호 갯수<=format안에 들어있는 값의 수 => 정상 동작
print('{}번 손님'.format(number,greeting))
문자열에 포함된 대괄호 갯수보다 format 안에 들어있는 값의 수가 적으면 에러
print('{}번 손님 {}'.format(number))

"""
#따옴표

string1 = 'Some text'
string2 = '어떤 텍스트'
string3 = '{}도 {}도 지금 이것도 문자열'.format(string1,string2)
print(string1,string2,string3)

quote = '문법검사기 왈 "직접인용은 큰따옴표다"'
emphasize = "'문법 검사기'를 인용하다니"
#error = "엄마 친구 아들이 "파이썬이 좋아"라고 했대"
#" " 안에 "를 쓸 수 없고, ' ' 안에 '를 쓸 수 없다
#따옴표 안에 따옴표 쓰려면 서로 다른 따옴표로 쓰자

long_string = """ 첫째 줄은 좋은데
둘째줄도 괜찮을까? """
#긴 string은 """ 또는 '''로 표현 => 줄 바꿈도 인식 가능
#긴 string을 이용하면 따옴표와 큰 따옴표를 섞어서 쓸 수 있음

print(long_string)

quote1 = "가끔은 '와" + '"를 모두 쓰기로 해'
quote2 = """가끔은 '와 "를 모두 쓰기로 해"""

print(quote1)
print(quote2)

#정수와 실수
five1 = 5
five2 = 5.0
five3 = 5.00000

print(five1)
print(five2)
print(five3)

five4 = 5*1
five5 = 5*1.0

print(five4)
print(five5)

div1 = 6/5 #연산 결과는 소수 단위까지 나옴
div2 = 6//5 #나눗셈에서 몫 구하기

#원래 정수 와 정수의 연산은 정수로 나오고 실수가 포함된 연산은 실수로 나오지만 나눗셈은 실수가 나올 가능성이 충분하기 때문에 정수 / 정수 여도 실수로
print(div1)
print(div2)

a = 6
b = 5
print(a == b*(a//b)+(a%b))

print(0.1 + 0.1 == 0.2) #True
print(0.1 + 0.1 + 0.1 == 0.3) #True?

print(int(5.0)) #정수로
print(float(5)) #부동소수점(실수)으로
print(5*1.0) #부동소수점(실수)으로


"""
사용자 입력 받기 : input()
간단한 print 기능도 내장되어 있음

input() : 사용자의 키보드 입력을 return
round() : 수의 반올림 값을 return

CTRL + C : 프로그램 즉시 종료

"""
print('가위 바위 보 가운데 하나를 내 주세요.',end=' ') #줄바꿈이 적용되지 않도록 하려면 end = ' ' 사용
mine = input()
print('mine', mine)

mine = input('가위 바위 보 중 하나를 내주세요') #간단한 print 기능도 있음
print('mine:',mine)

