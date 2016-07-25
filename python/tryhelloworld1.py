#파트1[시작하기] 파트2[변수와 계산]
print('Hello World!')

"""
<python의 실행>
script 언어로 빌드 과정 없이 바로 실행 가능
실행 시 git bash 이용 (Shell program)
compile : $ python test.py (파일명) 입력
python 의 확장자는 .py

"""
# 한줄 주석

#변수
season = '여름'
print('지금은',season,'입니다.')

"""
print 문에서는 , 로 구분
숫자는 따옴표 필요x

"""


#숫자/문자열

myname = 'Python' #문자열
myage = 25 #숫자

sum = 11+2 #더하기
multiple = 11*2 #곱하기
divide = 30/5  #나누기
power = 2**10 #거듭제곱
remainder = 15%4 #나머지

text = '2015'+'1991'
#string concatenation => +를 이용
number = 2015 + 1991
print(text, number)


"""
REPL : Powershell에서 파일 이름 없이 python 이라고만 입력하면 나오는 창
=> 파이썬 코드를 한 줄씩 입력해가면서 테스트해 볼 수 있는 입력창
=> REPL 창 종료 : exit()

*git bash 에서의 REPL*
python의 실행 확인 shell : $ ipython 입력
    * shell 탈출 : exit()
"""



"""
Shell : 운영체제(리눅스,맥,윈도우 등)가 사용자와 소통하는 방법
-Graphic shell
-Command line shell


Shell 명령어
pwd (print working directory) : 현재 폴더 경로 출력
ls (list segments) : 현재 폴더 내용물 출력
cd (change directory) : 다른 폴더로 이동 # .. 상위 폴더로 이동
cp (copy) : 파일을 다른 이름으로 복사
ex) cp test.py test1.py(복사본)
rm (remove) : 파일을 삭제

"""

