
list_1 = [2,4,7,9]
list_2 = [8,6,4,2]
k = 10

"""
print('output:')
for i in list_1:
    for j in list_2:
        if i+j == k:
            print(i j)

"""

for i in list_1:
    if k-i in list_2:
        print(i, k-i)


#print(''.join["%d,%d" % (i, k-i) for i in list_1 if k-i in list_2])