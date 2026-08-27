import numpy as np
rng = np.random.default_rng(seed = 23)#fixed random number if seed is used
print(rng.integers(1,31))#start end(exclusive)
print(rng.integers(low=1,high=31))
print(rng.integers(low=1,high=31,size=5))
print(rng.integers(low=1,high=31,size=(3,2)))
#float
print(np.random.uniform(low=100, high=1))
print(np.random.uniform(low=-100, high=1,size=(3,5,2)))


arr = np.array(["yeshua","jireh","rapha","elohim"])
rng.shuffle(arr)
print(arr)

print(rng.choice(arr))
