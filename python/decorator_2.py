## decorator 활용해서
## 가변적으로 들어오는 인자들의 절댓값의 합 구하기


# 함수 하나로
def mysum(*args):
    sum=0
    for i in args:
        sum+=abs(i)
    return sum

print(mysum(-1,2,-3))

#decorator 이용
def absolute(fn):
    def wrap(*args):
        # args = [abs(i) for i in args]
        # args = map(abs, args)
        return abs(fn(*args))
    return wrap

@absolute
def mysum(x, y, z):
    return x + y + z
print(mysum(-10, 1, 3))
