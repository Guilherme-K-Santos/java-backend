# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.javaserver.bridge-backend' is invalid and this project uses 'com.javaserver.bridgebackend' instead.

# Olá

Este é meu servidor springboot para o desafio técnico!

Usando diretivas básicas do springboot e notação MVC, criei dois endpoints (get todos os dados e post para calcular um número X)
que serão consumidos pelo frontend em ReactJS.

Um ponto interessante de ressaltar é que usei um módulo
de config para evitar problemas com a CORS Policy!


# Versões

- mySQL: 8.0.36
- Java: 22.0.1
- Springboot: 3.2.5

Também usei Postman (3.2.5) para testar os endpoints da API.

# Rodando com Frontend & mySQL
O frontend consumirá as API providas pelo springboot nos métodos GET e POST (Deixei tudo pronto para a CORS Policy não ser um problema). O deployment do backend no Heroku (a URL pode ser encontrada no código do frontend). 

Além disso, caso queiram testar o backend fora do deployment: o banco de dados mySQL deve ser configurado para a integração ser bem sucedida. Porém, apenas duas linhas devem ser alteradas para tudo fluir:
- Altere a URL abaixo com a dada pela database:
`spring.datasource.url=jdbc:mysql://hvmc3rvol5xg4vqe:vr6rqdzzd5x1xfw8@dyud5fa2qycz1o3v.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/p4u45vixwc7mcf7a`
- Coloque o username da base de dados mySQL no lugar de 'hvmc3rvol5xg4vqe' abaixo:
`spring.datasource.username=hvmc3rvol5xg4vqe`
- Coloque a sua senha da base de dados mySQL no lugar de 'vr6rqdzzd5x1xfw8' abaixo:
`spring.datasource.password=vr6rqdzzd5x1xfw8`
