# 💱 Conversor de Moedas - Java Console App

Este projeto é um **conversor de moedas via console** desenvolvido em Java, que utiliza a API [Extended Rate](https://open.er-api.com/) para buscar **cotações de câmbio em tempo real**. O programa oferece ao usuário 6 opções de conversão entre moedas populares e realiza os cálculos com base na taxa mais atual disponível.

## 🚀 Funcionalidades

- ✔️ Menu interativo via terminal
- ✔️ Conversão entre as seguintes moedas:
  - Real (BRL) ↔ Dólar (USD)
  - Euro (EUR) ↔ Real (BRL)
  - Dólar (USD) ↔ Euro (EUR)
- ✔️ Consumo de API externa com cotação em tempo real
- ✔️ Desserialização de JSON com a biblioteca GSON

## 📸 Demonstração

```
==== Conversor de Moedas ====
Escolha uma opção:
1. Real para Dólar
2. Dólar para Real
3. Euro para Real
4. Real para Euro
5. Dólar para Euro
6. Euro para Dólar
2
Digite o valor a ser convertido: 100
Valor convertido: 486.65 BRL
```

## 🛠️ Tecnologias utilizadas

- Java 17+
- Biblioteca [GSON](https://github.com/google/gson) (para manipular JSON)
- API [Extended Rate](https://open.er-api.com/)

## 📦 Como executar

1. **Clone o repositório:**

```bash
git clone https://github.com/seu-usuario/conversor-moedas-java.git
cd conversor-moedas-java
```

2. **Abra no IntelliJ IDEA ou outro IDE de sua preferência.**

3. **Adicione a biblioteca GSON ao projeto:**
   - Se usar Maven:
     ```xml
     <dependency>
       <groupId>com.google.code.gson</groupId>
       <artifactId>gson</artifactId>
       <version>2.10.1</version>
     </dependency>
     ```
   - Ou baixe manualmente o `.jar` e adicione às dependências do projeto.

4. **Execute a classe `ConversorMoedas` e siga as instruções no console.**


## 👩‍💻 Desenvolvido por

- *Ana Julia Veloso*
- Projeto realizado como parte do desafio de programação no curso ONE | TECH FOUNDATION - Especialização Back-End.
