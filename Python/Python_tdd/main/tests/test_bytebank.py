from bytebank import Funcionario

class TestClass:
    
    def test_quando_idade_recebe_13_03_2001_deve_retornar_22(self):
        entrada = "13/03/2001" #Given
        esperado = 22

        funcionario_teste = Funcionario('teste', entrada, 6000)
        resultado = funcionario_teste.idade() #When

        assert resultado == esperado #Then
