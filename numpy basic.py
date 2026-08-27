import numpy as np
arr = np.array([1,2,3,4,5,6])
arr_2 = np.array([1,2,3,'a']) #str_ or <u21
arr_3 = np.array([2.,1.2,3.9]) #bool_
arr_4 = np.array([True,False,True,False])
print(arr)
print(type(arr)) #<class 'numpy.ndarray'>
print(arr.dtype) #int64
print(arr_2)  #every elemnts string ayrum['1','2','3','a']
print(arr_2.dtype) #<U21 (little-endian unicode string max string length (21 char))
print(arr.nbytes)
print(arr_3.dtype)
print(arr_4.dtype)
array = np.array([1,2,3,True,"Essy"], dtype=np.object_)#object_
print(array)
print(array.dtype)
print(f"{array.nbytes} bytes")#also learn how to  fix the limit of int(over flow)



print(arr_2.astype(np.str_)) #converts into string  even bool_




