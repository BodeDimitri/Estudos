import numpy as np
import matplotlib as plt

dado = np.loadtxt('numpy-dados/apples_ts.csv',delimiter=',',usecols=np.arange(1,6,1))

diametro_laranja = dado[:5000,0]
diametro_toranja = dado[5000:,0]
peso_laranja = dado[:5000,1]
peso_toranja = dado[5000:,1]

plt.plot(diametro_laranja,peso_laranja)
plt.plot(diametro_toranja,peso_toranja)

Y = peso_laranja
X = diametro_laranja
n = np.size(X)

a = (n*np.sum(X*Y) - np.sum(X)*np.sum(Y))/(n*np.sum(X**2)-np.sum(X)**2)
b = np.mean(Y) - a*np.mean(X)