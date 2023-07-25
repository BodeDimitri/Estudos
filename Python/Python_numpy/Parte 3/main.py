import numpy 
import matplotlib.pyplot as plt

dado = (numpy.loadtxt('numpy-dados/apples_ts.csv',delimiter=',',usecols=numpy.arange(1,88,1)))

#print(dado)

#print(dado.ndim)

#print(dado.size)

#print(dado.shape)

#print(dado.T)

dado_transponsto = dado.T

datas = dado_transponsto[:,0]
datas = numpy.arange(1,88,1)

preco = dado_transponsto[:,1:6]

#print(plt.plot(datas,preco[:,0]))

Moscow = preco[:,0]

Moscow_ano1 = Moscow[0:12]
Moscow_ano2 = Moscow[13:25]
Moscow_ano3 = Moscow[25:37]
Moscow_ano4 = Moscow[37:49]

plt.plot(numpy.arange(1,13,1),Moscow_ano1)
plt.plot(numpy.arange(13,25,1),Moscow_ano2)
plt.plot(numpy.arange(25,37,1),Moscow_ano3)
plt.plot(numpy.arange(37,49,1),Moscow_ano4)
plt.legend(["Ano1","Ano2","Ano3","Ano4"])

#print(numpy.array_equal(Moscow_ano3,Moscow_ano4))

#print(numpy.allclose(Moscow_ano1,Moscow_ano2,10))

#print(numpy.isnan(Moscow_ano1))

#print(numpy.mean([Moscow[3],Moscow[5]]))

x = datas
y = 0.52*x+80
numpy.linalg.norm(Moscow-y)
