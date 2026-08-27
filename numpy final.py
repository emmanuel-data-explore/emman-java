import os
print(os.getcwd())
import numpy as np
arr = np.array([1,2,3,4,5])   # save & retrieve
np.save("data.npy",arr)
read = np.load("data.npy")
print(read)
brr = np.array([6,7,8,9])
np.savez("datas.npz",arr,brr)
read = np.load("datas.npz")
print(read)
print(read["arr_1"])
#linear algebra
a = np.array([
    [1,2],
    [3,4]
    ])
b = np.array([[4,2],[1,2]])
print(np.matmul(a,b))
a1=np.array([1,2,3])
b1=np.array([4,2,1])
print(np.dot(a1,b1))
print(b.T)
print(np.linalg.det(a))
