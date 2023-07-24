import numpy 

dado = (numpy.loadtxt('numpy-dados/apples_ts.csv',delimiter=',',usecols=numpy.arange(1,88,1)))

print(dado)

print(dado.ndim)

print(dado.size)

print(dado.shape)

print(dado.T)
