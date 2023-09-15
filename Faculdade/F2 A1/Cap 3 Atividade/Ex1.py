assinaturaCliente = input('Qual e o seu tipo de assinatura? Basic/Silver/Gold/Platinum ')
faturamentoAnual = float(input('Qual foi seu faturamento anual? '))
rendaEmpresa = 0

if assinaturaCliente == 'Basic':
    rendaEmpresa = faturamentoAnual * 0.30
elif assinaturaCliente == 'Silver':
    rendaEmpresa = faturamentoAnual * 0.20
elif assinaturaCliente == 'Gold':
    rendaEmpresa = faturamentoAnual * 0.10
elif assinaturaCliente == 'Platinum':
    rendaEmpresa = faturamentoAnual * 0.05
else:
    print('Assinatura invalida')

print(f'A renda da nossa empresa foi de {rendaEmpresa}')