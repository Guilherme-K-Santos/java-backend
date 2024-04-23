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
O frontend consumirá as API providas pelo springboot nos métodos GET e POST (Deixei tudo pronto para a CORS Policy não ser um problema).

Além disso, O banco de dados mySQL deve ser configurado para a integração ser bem sucedida. Porém, apenas duas linhas devem ser alteradas para tudo fluir:
- Altere 'bridge_webapp' com o nome da sua base de dados criada (cheque a porta do localhost tbb)
`spring.datasource.url=jdbc:mysql://localhost:3306/bridge_webapp?useSSL=false`
- Coloque a sua senha da base de dados mySQL no lugar de 'heracross2024' (o melhor pokemon tipo inseto) abaixo:
`spring.datasource.password=heracross2024`
