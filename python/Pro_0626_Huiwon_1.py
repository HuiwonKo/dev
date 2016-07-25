import random

print('GUESS THE NUMBER')

print('Hello! What is your name?')
name = input() #이름 입력
answer = random.randint(1,21) #답

print('Well,',name,'I am thinking of a number between 1 and 20. Take a guess')

count = 0 #몇 번에 맞췄는지 세는 변수

while True:
    number = int(input()) #i nput으로 받은 값의 type 이 string 이므로 int로 형변환
    count = count + 1

    if number > answer :
        print('Your guess is too high')
        print('Take a guess')

    elif number < answer :
        print('Your guess is too low')
        print('Take a guess')

    else :
        print('Good job,',name,'! You guessed my number in ',count,'guesses!')
        break #답을 맞췄을 경우 빠져나온다


