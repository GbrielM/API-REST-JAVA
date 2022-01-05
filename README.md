# DESAFIO-BRISA

Desafio Back end Brisalabs 💻
O desafio consiste no desenvolvimento de uma API REST utilizando as tecnologias listadas abaixo.

Tecnologias 🚀
NestJS ou Express
Typescript
Typeorm
Postgres
Insomnia
REST
Sobre o desafio 📌
O desafio consiste em desenvolver uma API REST para o sistema de transações do BrisaPIX.

Básico

O sistema deve ser capaz de estabelecar uma conexão com um banco de dados Postgres.
O sistema deve ser capaz de lidar com requisições com formato de dados do tipo JSON.
O sistema deve ser capaz de cadastrar usuários.
O sistema deve ser capaz de persistir essas informações em um banco de dados relacional.

Intermediário

O sistema deve ser capaz de cadastrar chaves PIX para os usuários já cadastrados.
Uma chave não poderá ser cadastrada mais de uma vez.
Cada usuário poderá ter no máximo 3 chaves.
O sistema deve ser capaz de persistir essas informações em um banco de dados relacional.

Avançado

O sistema deve ser capaz de realizar transações PIX utilizando chaves cadastradas de usuários.
Cada transação deve ser identificada de forma única por um id.
Cada transação deve conter a identificação do usuário que envia e do usuário que recebe o PIX, além do valor, claro.
O sistema deve ser capaz de persistir essas informações em um banco de dados relacional.

Bonus

Adicionar um docker-compose e um Dockerfile.
Disponibilizar no repositório o arquivo JSON referente às rotas da aplicação.
Adicionar testes unitários.
Adicionar tratação de erros de maneira global.


Entidades ✏️

Usuários
O usuário deve possuir nome (nome do usuário), telefone (telefone do usuário) e um id.
Chaves.
A entidade chaves deve possuir um valor (referente a chave a ser salva), id e a relação com o usuário dono da chave.
Transações.
A transação deve possuir um valor (referente ao valor em R$ da transação), relação com quem envia e quem recebe o PIX (usuário que envia e usuário que recebe o PIX) e um id.
Critérios de avaliação 📝
Arquitetura
Clean code
Clareza
Ausência de bugs
 
