- Implementar função para gerar hash da senha
- Implementar DELETE
- Melhorar tela de exibição da lista


- Acesso ao banco de dados mySQL utilizando a biblioteca JDBC
- Os métodos para manipulação do banco estão na classe Query
- O sistema permite cadastrar dois tipos de usuário: comum e administrador
- A senha informada no momento do cadastro é submetida a uma função geradora de um hash, o qual é armazenado no banco para posterior validação
- O acesso ao sistema é feito mediante validação de usuário e senha
- Se o login for realizado com sucesso, são exibidas diferentes opções a depender do tipo do usuário logado (comum ou administrador)
- O sistema roda em loop até que o usuário escolha a opção sair através do menu