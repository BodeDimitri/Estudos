from abc import ABCMeta, abstractmethod

class Conta(metaclass=ABCMeta):

  def __init__(self, codigo):
    self.codigo = codigo
    self.saldo = 0

  def deposita(self, valor):
      self._saldo += valor

    @abstractmethod
    def passa_o_mes(self):
      pass