#arange
import numpy as np
arr = np.arange(0,100,2)#start stop step
print(arr)
arr1 = np.linspace(0,100,6)#start stop count(evenly spaced 6 num venum) 
print(arr1)
print(np.mean(arr))
print(np.median(arr))
print(np.max(arr))
print(np.min(arr))
print(np.std(arr))
print(np.var(arr))#ellam statistic term
print(np.argmax(arr1))
arr2 = np.array([
    [1,2,3],
    [4,5,5],
    ])
print(np.sum(arr2))
#normal ah prev matrix maari panalam
print(np.argmax(arr2)) #matrix ah maathi  prev maari panoo
print(np.sum(arr2, axis=1)) #row  wise seperate sum
print(np.sum(arr2, axis=0))


