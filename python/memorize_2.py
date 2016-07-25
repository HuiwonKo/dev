import time

def memorize(fn):
    cached = {}
    def wrap(x,y):
        key = (x,y)
        if key not in cached:
            cached[key] = fn(x,y)
        return cached[key]
    return wrap

@memorize
def mysum(x,y):
    time.sleep(1)
    return x+y

@memorize
def mymultiply(x,y):
    time.sleep(1)
    return x*y

print(mysum(1,2))
print(mysum(3,4))
print(mysum(1,2))
print(mysum(1,2))


print(mymultiply(1,2))
print(mymultiply(3,4))
print(mymultiply(1,2))
print(mymultiply(1,2))


