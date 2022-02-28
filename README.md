# Dio Desafio Banco
 Criar um banco utilizando Programação Orientada a Objetos
 
### Classes iniciais
- **Banco:** Banco Digital que possui "Contas corrente" e "contas salário"
- **CLiente:** Cliente do banco que pode ter conta corrente e conta salário
- **Conta:** Classe mãe
- **ContaCorrente:** Classe filha que herda da classe mãe 'Conta'.
- **ContaSalario:** Classe filha que herda da classe mãe 'Conta'.
- **Main:** Classe de execução principal

### Visibilidades
- Abstract: Utilizado na classe mãe CONTA para que ninguém instancie ela, a não ser as classes filhas
- Extends: Utilizado nas classes filhas, para herdar métodos e atributos
- Protected: Encapsula os atributos da classe mãe CONTA, para que sejam acessados pela classe filha ContaCorrente e ContaPoupanca

