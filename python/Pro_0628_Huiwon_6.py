def average(a,b):
	return (a+b)/2

def MaxMin(listA):
	Max = listA[0]
	Min = listA[0]

	for i in listA:
		if Max < i:
			Max = i

	for j in listA:
		if Min > j:
			Min = j

	return Max,Min

def area(a,b):
	return a*b

def sum(a,b):
	return (b-a+1)(a+b)/2

class Point():

	def __init__(self,x,y):
		self.x = x
		self.y = y
		print("init")
		print("x=",self.x," y=",self.y)

	def set(self,x,y):
		self.x = x
		self.y = y
		print("set")
		print("x=",self.x," y=",self.y)

	def get(self):
		print("get")
		print("x=",self.x," y=",self.y)
		return self.x,self.y

	def move(self,dx,dy):
		self.x += dx
		self.y += dy
		print("move")
		print("x=",self.x," y=",self.y)

point = Point(1,2)
point.set(3,4)
point.get()
point.move(2,3)
