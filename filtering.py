import numpy as np
arr = np.array([10,30,25,20,16])
print(arr)
print(arr[arr<15])
print(arr>15)
pathuku_mela =arr[arr>10]
print(pathuku_mela)
print(arr)  #arr change agathu bcs inonu la save panirukomla
even= arr[arr%2 == 0]
print(even)
multiple_condition = arr[(arr>10)&(arr<20)] #numpy c la pananga so aand podaama & use panuvoom , |(or)
print(multiple_condition)
arr1 = np.array([
    [1,2,3],
    [4,5,6]
    ])
even = arr1[arr1%2==0] #flatten pani op tharum
print(even)
even_1 = arr1[(arr1 % 2 == 0) | (arr1 == 1)]
print(even_1)
even = np.where(arr1%2 == 0, arr1, 0) #0 enava venaluu irukalam structure flatten illama preserve panradhuku
print(even)

