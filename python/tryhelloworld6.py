#파트15[클래스와 객체지향프로그래밍] #파트16[상속과 다형성]

#자료형 검사

"""
type( a ) # type( 변수명 ) : 자료형
isinstance( 42, int ) # isinstance( 값, 자료형 ) : 자료형 검사

"""

numbers1 = []
numbers2 = list(range(10))

characters = list("hello")


"""
**클래스
함수나 변수들을 모아 놓은 집합체

**인스턴스
클래스에 의해 생성된 객체
인스턴스 각자 자신의 값을 가지고 있다.


"""

list1 = [1, 2, 3]
list2 = [1, 2, 3]

if list1 is list1: #같은 인스턴스인지 확인
    print("당연히 list1과 list1은 같은 인스턴스입니다.")

if list1 == list2:
    print("list1과 list2의 값은 같습니다.")
    if list1 is list2:
        print("그리고 list1과 list2는 같은 인스턴스입니다.")
    else:
        print("하지만 list1과 list2는 다른 인스턴스입니다.")


list1 = list(range(10))
list2 = [1, 2, 3]

if isinstance(list1 , list) and isinstance(list2 , list):
    print("list1과 list2는 둘 다 list클래스 입니다.")

#클래스

class Human():  #클래스
    '''사람'''

person1 = Human() #인스턴스 생성
person2 = Human()

person1.language = '한국어'
person2.language = 'English'

def speak(person):
    print('{}이 {}로 말을 합니다.'.format(person.name,person.language))

speak(person1)
speak(person2)

Human.speak = speak

person1.speak() #매개변수를 쓰지 않아도 가능
person2.speak()




a = list() # 리스트 클래스에 대한 인스턴스 생성

a= [1,2,3]
a.append(4)
a.remove(1)


class Human():
    '''인간'''

"""
person = Human()
person.name = '철수'
person.weight = 60.5

"""


def create_human(name,weight):
    person = Human()
    person.name = name
    person.weight = weight
    return person

def eat(person):
    person.weight += 0.1
    print("{}가 먹어서 {}kg이 되었습니다.".format(person.name,person.weight))

def walk(person):
    person.weight -= 0.1
    print("{}가 걸어서 {}이 되었습니다.".format(person.name,person.weight))


Human.create = create_human
Human.eat = eat
Human.walk = walk

person = Human.create('철수',60.5)
person.walk()
person.eat()
person.walk()

#메서드 : 클래스에 묶여서 클래스의 인스턴스와 관계되는 일을 하는 함수

class Human( ):
    '''인간'''

    def create( name, weight ): #메서드
        person = Human()
        person.name = name
        person.weight = weight
        return person

    def eat( self ):
        self.weight += 0.1
        print("{}가 먹어서 {}kg이 되었습니다".format(self.name, self.weight))

    def walk( self ):
        self.weight -= 0.1
        print("{}가 걸어서 {}kg이 되었습니다".format(self.name, self.weight))

    def speak(self,message):
        print(message)



person = Human.create("철수", 60.5)
person.eat() #인스턴스의 매개변수를 전달할 때는 self를 생략하고 전달
#eat() 은 error
person.speak("안녕하세요") #self 매개변수는 전달할 필요 없음




#특수한 메서드

class Human( ):
    '''인간'''
    def __init__(self,name,weight):
        '''초기화 함수'''
        self.name = name
        self.weight = weight

    def __str__(self):
        '''문자열의 함수'''
        return "{}의 몸무게 {}kg".format(self.name,self.weight)

    def create( name, weight ): #메서드
        person = Human()
        person.name = name
        person.weight = weight
        return person

    def eat( self ):
        self.weight += 0.1
        print("{}가 먹어서 {}kg이 되었습니다".format(self.name, self.weight))

    def walk( self ):
        self.weight -= 0.1
        print("{}가 걸어서 {}kg이 되었습니다".format(self.name, self.weight))

    def speak(self,message):
        print(message)


#상속

"""
상속하는 클래스를 부모 클래스
상속받는 클래스를 자식 클래스
자식 클래스가 부모 클래스의 내용을 가져다 쓸 수 있는 것

"""


class Animal():

    def __init__(self,name):
        self.name = name

    def walk(self):
        print("걷는다")

    def eat(self):
        print("먹는다")

    def greet(self):
        print("{}가 인사한다".format(self.name))

class Human(Animal): # Animal - 부모 클래스

    def __init__(self,name,hand):
        super().__init__(name)
        self.hand = hand

    def wave(self):
        print("{}을 흔든다".format(self.hand))

    def greet(self): #오버라이드
        self.wave()
        super().greet() # super() : 자식 클래스에서 부모 클래스의 내용을 사용하고 싶은 경우
        # super().부모클래스내용

class Dog(Animal):

    def wag(self):
        print("꼬리를 흔든다")

    def greet(self): #오버라이드
        self.wag()

person = Human('A','손')
person.walk()
person.eat()
person.wave()
person.greet()

dog = Dog()
dog.walk()
dog.eat()
dog.wag()
dog.greet()


