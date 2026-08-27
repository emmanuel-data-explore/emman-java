import numpy as np
arr = np.array([
    [1,2,3],
    [4,5,6],
    [7,8,9]
    ])
#indexing

print(arr)
print(arr[0]) #zero based index
print(arr[1])
print(arr[-1])  #neg index
print(arr[-3])
print(arr[0][2])
print(arr[0,2])
print(arr[1:2])   #start,stop,end
print(arr[0:3:2])   # start,end,step
print(arr[:1])
print(arr[:-1])
print(arr[::-1])   
print(arr[:,2])
print(arr[:,0:1]) #comma ku apro varadhu ellam column 
print(arr[:,0:3:2])#comma ku apro column last one thaan step
print(arr[:,::-1])
print(arr[1:3:1, 1:3:1])#comma ku apro column select panreen
print(arr[0:2:1, 0:2:1])
