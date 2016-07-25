def alert(maximum):
    def wrap(fn):
        def inner(x,y):
            result = x+y
            if result > maximum:
                print("경고")
            return result
        return inner
    return wrap

@alert(10)
def mysum(x,y):
    return x+y

r