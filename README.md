# Desafio - Cálculo de Conta em um Bar 🍻

Este projeto Java simula o cálculo de uma conta em um bar, considerando as regras de negócio abaixo:

- Gênero do cliente (M/F) para definir o valor do ingresso  
- Quantidade de cervejas, refrigerantes e espetinhos  
- Isenção de couvert artístico se o consumo for maior que R$ 30,00  

---

## 💻 Tecnologias utilizadas
- Java 17  
- Eclipse IDE  

---

## 📄 Lógica aplicada
- **Cerveja:** R$ 5,00  
- **Refrigerante:** R$ 3,00  
- **Espetinho:** R$ 7,00  
- **Ingresso:** R$ 10,00 (homem) / R$ 8,00 (mulher)  
- **Couvert artístico:** R$ 4,00 (isento se consumo > R$ 30,00)  

---

## 📦 Estrutura
- **Main.java**: classe principal, responsável pela entrada de dados e geração do relatório  
- **Conta.java**: classe que centraliza as regras de negócio (consumo, couvert, ingresso e valor total), com encapsulamento e construtor  

---

## 📌 Próximos passos (melhorias futuras)
- Refatorar gênero para usar **enumeração** em vez de `char`  
- Criar testes unitários para validar os cálculos  
- Melhorar a exibição do relatório com método `exibirInfo()` dentro da classe `Conta`  

---


## ✅ Exemplo de execução

```bash
Genero: M
Quantidade de cervejas: 3
Quantidade de refrigerantes: 1
Quantidade de espetinhos: 2

RELATÓRIO:
Consumo: R$ 31.00
Isento de couvert...
Ingresso: R$ 10.00

Valor Total a Pagar: R$ 41.00


