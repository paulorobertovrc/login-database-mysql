Este projeto utiliza os conceitos de Programação Orientada a Objetos (encapsulamento, herança e polimorfismo - fazendo a sobrecarga de métodos) na construção de um sistema que permite acesso e manipulação de dados em banco mySQL, utilizando a biblioteca JDBC. Além disso, há uso massivo de classes, atributos e métodos abstratos.
O destaque é a utilização de um algoritmo para criar um hash da senha fornecida pelo usuário, de modo que esse hash - e não o texto puro - é armazenado no banco de dados para posterior validação.
Não foram utilizados frameworks.

Principais funcionalidades:
- Ao realizar a conexão, caso não exista, a tabela é criada;
- Os métodos para manipulação do banco, em linguagem SQL, estão na classe Query;
- O sistema permite cadastrar dois tipos de usuário - comum e administrador -, posteriormente exibindo menus padronizados para cada tipo após a entrada no sistema;
- A senha informada no momento do cadastro é submetida a uma função geradora de um hash, o qual é armazenado no banco para posterior validação. O algoritmo utilizado foi o MD5 da biblioteca Java Security;
- O acesso ao sistema é feito mediante validação de usuário e senha;
- O sistema roda em loop até que o usuário escolha a opção sair através do menu.

Biblioteca externa necessária: mysql-connector-j-8.0.31.jar

---------

This project uses Object Oriented Programming concepts (encapsulation, inheritance and polymorphism - overloading methods) in the construction of a system that allows access and manipulation of data in mySQL database, using the JDBC library. In addition, there is massive use of classes, attributes and abstract methods.
The highlight is the use of an algorithm to create a hash of the password provided by the user, so that this hash - and not the plain text - is stored in the database for later validation.
No frameworks were used.

Main features:
- When performing the connection, if it does not exist, the table is created;
- The database manipulation methods, in SQL language, are in the Query class;
- The system allows you to register two types of user - common and administrator -, later displaying standardized menus for each type after entering the system;
- The password entered at the time of registration is subjected to a function that generates a hash, which is stored in the database for later validation. The algorithm used was MD5 from the Java Security library;
- Access to the system is done through username and password validation;
- The system runs in a loop until the user chooses the exit option through the menu.

Required external library: mysql-connector-j-8.0.31.jar

