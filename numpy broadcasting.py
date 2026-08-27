import numpy as np
arr = np.array([      #3x3
    [1,2,3],
    [4,5,6],
    [7,8,9]
    ])
brr = np.array([1,2,3])#3x1 replicate same as 1,2,3, 1,2,3 1,2,3 3x3  ah mathanu adhuvey paniku
crr = np.array([[1],[2],[3]])#1x3 column replicate
print(arr.shape)
print(brr.shape)
print(arr * brr)
print(arr * crr)
