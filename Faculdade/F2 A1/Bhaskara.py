import math

a = float(input('Informa o valor de A: '))
b = float(input('Informa o valor de B: '))
c = float(input('Informe o valor de C: '))

delta = 4 * b - 4 * a * c

if delta > 0.0:
    x1 = (-b + math.sqrt(delta)) / (2 * a)
    x2 = (-b - math.sqrt(delta)) / (2 * a)
    print(f'Para a equação {a}x² + {b}x + {c} = 0, obtivemos os seguintes valores: x1 = {x1} e x2 = {x2}')
elif delta == 0.0:
    x = (-b + math.sqrt(delta)) / (2 * a)
    print(f'Para a equação {a}x² + {b}x + {c} = 0, obtivemos o seguinte valor: x = {x}')
else: 
    print(f'Para a equação {a}x² + {b}x + {c} = 0, não existem valores reais para x')