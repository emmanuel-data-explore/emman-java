import numpy as np
arr = np.array([25,24,5,2])
print(arr + 1)
print(arr - 5)
print(arr * 5)
print(arr ** 5)

a = np.sqrt(arr)
print(a)
print(np.round(a))
print(np.floor(a))#nxt num ku round aagathu
print(np.ceil(a))

#2 array operation
brr = np.array([1,2,3,4])
print(arr + brr)
print(arr * brr)
print(arr  - brr)
print(arr / brr)
print(arr ** brr)

# circumfurence
print(2*np.pi*brr)

#comparision
age = np.array([25,18,16,5,4])

print(age<18)
print(age==18)
age[age<18] = 18
print(age)
