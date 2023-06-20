from validate_docbr import CPF

class Cpf:
    def __init__(self, documento):
        documento = str(documento)  
        if self.cpf_e_valido(documento):
            self.cpf = documento
        else:
            raise ValueError("cpf invalido!")

    def cpf_e_valido(self, cpf):
        validador = CPF()   
        if len(cpf) == 11:
            return validador.validate(cpf)
        else:
            raise ValueError('Quantidade de digitos invalida')
        
    def formata_cpf(self):
        mascara = CPF()
        return mascara.mask(self.cpf)
        
    def __str__(self):
        return self.formata_cpf()