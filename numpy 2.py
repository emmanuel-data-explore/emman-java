import numpy  as  np
array = np.array(1)
print(array)
print(array.ndim) #one element cannot be a dimension
mat = np.array([  
    [1,2,3], #inex[0] 1st row        #array inside array nested
    [4,5,6] #index[1] 2nd row           #1,4 column 1 index[0]
    ])
print(mat)
print(mat.ndim) #2x2 matrix
mat_3 = np.array([[1,2,3],[4,5,6],[7,8,9]])
                 #or
mat_3 = np.array([
    [
    [1,2,3],
    [4,5,6],
    [7,8,9]
    ]
    ])
print(mat_3)
print(mat_3.ndim)

#3d array apart from row and column there is layer(layer_1-2d, layer_2-2d)
mat_4 = np.array([
    [
        [1,2,3],
        [4,5,6]      #layer_1
        ],
    [                              #uniform ahh illana error
        [7,8,9],
        [10,11,12]   #layer_2
        ]
    ])
print(mat_4)
print(mat_4.ndim)      # length breadth and layers 3d


#indexing of array
print(mat[1][1])
print(mat_3[0][2][0])#use layers rows and columns
print(mat_3[0,2,0])
print(mat_4 [1][1][2]) #chain index
print(mat_4[1,1,2]) #multi dim index
print(mat_4.shape)   #uses


#shape reshape
print(mat.shape)  # row column
print(mat_3.reshape(1,9)) #multiply and vverify the number of elements
print(mat_3.reshape(-1,9))
print(mat_3.reshape(9,-1)) #-1 for random or unknown index
