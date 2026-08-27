import numpy as np
#zeros
print("zeros")
arr_1 = np.ones(5)
arr_2 = np.ones((2,3)) #RC
arr_3 = np.ones((2,3,4))#layers R C
print("1D",arr_1)
print("2D",arr_2)
print("3D",arr_3)
#ones
print("ones")
arr_11 = np.zeros(5)
arr_12 =np.zeros((2,3))
arr_13 =np.zeros((2,3,4))
print("1D",arr_11)
print("2D",arr_12)
print("3D",arr_13)
#eyes
print("eyes matrix")
a = np.eye(2)
b = np.eye(3)
print("2d",a)
print("3d",b)
print("Reshaped",b.reshape(((1,3,3))))
#full
print("Full")
arr = np.full((2,3), 45)
arrf1 = np.full((3,2,4),40)
print(arr)
print(arrf1)
#empty
print("empty")
arre1 = np.empty(5)
arre2 = np.empty((2,3))
arre3 = np.empty((3,2,4))
print(arre1)
print(arre2)
print(arre3)


