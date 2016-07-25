#List/Dictionary Comprehension


areas = []
for i in range(1,11):
    areas = areas + [i*i]
print("areas:",areas)


areas2 = [ i*i for i in range(1,11) if i%2 == 0 ]
print("areas2:",areas2)


students = ['태연','진우','정현']
for number, name in enumerate(students):
        print("()번의 이름은 ()입니다.".format(number,name))
students_dict = ("()번".format(number+1) : name for number,name in enumerate(students))

scores = [75,92,78]
for x,y in zip(students,scores):
    print(x,y)

score_dic = [students : score for student,score in zip(students,scores)]

"""list comprehension"""

[i*i for i in range(1,11)]
[i*i for i in range(1,11) if i%2 ==0]
[(x,y) for x in range(15) for y in range(15)]


"""dictionary comprehension"""
["{}번".format(number):name for number,name in enumerate(students)]