# 식사 / 뒷풀이 장소 고르기 프로그램
import random
dinner = {}
wrapup = {}

def eat(): #식사 정보 입력
    print('\n**식사 입력**')
    while True:
        name = input('식당 이름: ')
        food = input('음식 종류: ')
        dinner[name] = food
        string_1 = input("계속 입력하시겠어요?")
        if string_1 == 'End':
            break

def drink(): #뒷풀이 정보 입력
    print('\n**뒷풀이 입력**')
    while True:
        name = input('뒷풀이 장소 이름: ')
        food = input('술 종류: ')
        wrapup[name] = food
        string_1 = input()
        if string_1 == 'End':
            break



print('식사 혹은 뒷풀이라고 입력')
answer = input()

if answer == '식사':
    eat()


drink()

while True:
    choice = input('랜덤 뽑기 진행할래?')
    list_key1 = list(dinner.keys()) #dinner 딕셔너리의 key만 뽑아서 list 만들기
    list_key2 = list(wrapup.keys()) #wrapup 딕셔너리의 key만 뽑아서 list 만들기
    if choice.upper() == 'y' :
        print(dinner)
        print(wrapup)
        random_key1 = random.choice(list_key1) # random하게 dinner에 대한 key 결정
        print(random_key1,dinner[random_key1])
        del(dinner[random_key1])
        random_key2 = random.choice(list_key2) # random하게 wrapup에 대한 key 결정
        print(random_key2,wrapup[random_key2])
        del(wrapup[random_key2])
    else :
        break
