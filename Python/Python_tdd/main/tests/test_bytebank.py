from bytebank import Funcionario
import pytest
from pytest import mark

class TestClass:
    
    def test_quando_idade_recebe_13_03_2001_deve_retornar_22(self):
        entrada = "13/03/2001" #Given
        esperado = 22

        funcionario_teste = Funcionario('teste', entrada, 6000)
        resultado = funcionario_teste.idade() #When

        assert resultado == esperado #Then

    def test_quando_sobrenome_recebe_Lucas_carvalho_retornar_Carvalho(self):
        entrada = "Lucas Carvalho"
        esperado = "Carvalho"

        funcionario_teste = Funcionario(entrada, '28/07/2001', 6000)
        resultado = funcionario_teste.sobrenome()

        assert resultado == esperado

    def test_decressimo_salario_quando_recebe_100000_deve_retornar_90000(self):
        entrada = 100000
        entrada_nome = 'Paulo Bragança'
        esperado = 90000

        funcionario_teste = Funcionario(entrada_nome, '28/07/2001', entrada)
        resultado = funcionario_teste.reduzir_salario()

        assert resultado == esperado

    def test_quando_calcular_bonus_recebe_1000_retornar_100(self):
        entrada = 1000
        esperado = 100

        funcionario_teste = Funcionario('Ana','12/09/1964', entrada)
        resultado = funcionario_teste.calcular_bonus()

        assert resultado == esperado

    def test_quando_calcular_recebe_10000_deve_retornar_expection(self):
        with pytest.raises(Exception):
            entrada = 10000000

            funcionario_teste = Funcionario('Ana','12/09/1964', entrada)
            resultado = funcionario_teste.calcular_bonus()

            assert resultado 

    def test_retorno_str(self):
        nome, data, salario = 'teste', '12/07/2012', 1000 #given
        esperado = 'Funcionario (teste, 12/07/2012, 1000)' #when

        funcionario_teste = 'Funcionario (teste, 12/07/2012, 1000)' #then
        resultado = funcionario_teste.__str__()

        assert resultado == esperado