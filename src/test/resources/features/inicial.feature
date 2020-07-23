#language:pt
@LojaVirtual
Funcionalidade: Loja Virtual
  Validar busca por livro

  @ValidarLivro1
  Cenario: Validar Livro
    Dado que estou na pagina principal da loja virtual
    Quando realizo a busca do livro "Fortaleza Digital"
    Entao valido o titulo sendo "[PRODUTO DE EXEMPLO] - Fortaleza Digital"
    E o preco sendo "R$519,90"
    Quando clico no livro pesquisado
    Entao confirmo o titulo sendo "[PRODUTO DE EXEMPLO] - Fortaleza Digital" e o preco sendo "R$519,90"

  @ValidarLivro2
  Cenario: Validar Livro
    Dado que estou na pagina principal da loja virtual
    Quando realizo a busca do livro "Menina"
    Entao valido o titulo sendo "[PRODUTO DE EXEMPLO] - A Menina que Roubava Livros"
    E o preco sendo "R$821,30"
    Quando clico no livro pesquisado
    Entao confirmo o titulo sendo "[PRODUTO DE EXEMPLO] - A Menina que Roubava Livros" e o preco sendo "R$821,30"

	@ExemploEsquema
  Esquema do Cenario: Validar Livros <titulo>
    Dado que estou na pagina principal da loja virtual
    Quando realizo a busca do livro "<titulo>"
    Entao valido o titulo sendo "<tituloLivro>"
    E o preco sendo "<preco>"
    Quando clico no livro pesquisado
    Entao confirmo o titulo sendo "<tituloLivro>" e o preco sendo "<preco>"

    Exemplos: 
      | titulo            | tituloLivro                                         | preco    |
      | Fortaliza Digital | [PRODUTO DE EXEMPLO] - Fortaleza Digital            | R$519,90 |
      | Menina            | [PRODUTO DE EXEMPLO] - A Menina que Roubava Livros | R$821,30 |
