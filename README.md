# Consultor de CEP - Java

Aplicação desenvolvida em Java que realiza a consulta de CEPs utilizando a API pública ViaCEP.
O projeto foi criado como parte da finalização de um curso da Alura, com foco em boas práticas
de organização, consumo de APIs e tratamento de exceções.

## 🚀 Funcionalidades
- Consulta de CEP via API ViaCEP
- Tratamento de CEP inválido e CEP inexistente
- Uso de exceções personalizadas
- Salvamento dos CEPs consultados em arquivo
- Estrutura organizada em Service e Repository

## 🛠️ Tecnologias utilizadas
- Java
- API ViaCEP
- HttpClient
- Gson
- Records
- Exceptions personalizadas

## ▶️ Como executar o projeto
1. Clone o repositório
2. Execute a classe `Main`
3. Digite um CEP válido ou `SAIR` para encerrar a aplicação

## 📁 Estrutura do projeto
- `Main` → ponto de entrada da aplicação
- `ViaCEPService` → responsável pela comunicação com a API ViaCEP
- `CEPRepositorio` → responsável por salvar os CEPs consultados em arquivo
- `CEPJson` → DTO para mapeamento do JSON
- `CepInvalidoException` → exceção personalizada para erros de CEP

## 📚 Aprendizados
- Consumo de APIs REST em Java
- Uso do HttpClient
- Conversão de JSON para objetos com Gson
- Boas práticas de separação de responsabilidades
- Tratamento de exceções
