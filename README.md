# elevate-te# Elevate Tech - Backend (Spring Boot)

Este repositório contém o backend do projeto **Elevate Tech**, desenvolvido em Spring Boot. O objetivo é criar uma API robusta e escalável, seguindo boas práticas de arquitetura e desenvolvimento.

## 🚀 Stack Utilizada
- **Linguagem:** Java 17
- **Framework:** Spring Boot
- **Banco de Dados:** PostgreSQL
- **Ferramentas:** Docker, Maven, JUnit, Mockito

## 📂 Estrutura do Projeto
O projeto segue o padrão **Hexagonal (Ports and Adapters)** com as seguintes camadas:
- **Adapter:** Controllers e gateways.
- **Application:** Use cases e regras de negócio.
- **Configuration:** Configurações do Spring.
- **Core:** Domínio e interfaces de repositório.

## 🛠️ Como Executar o Projeto
1. Clone o repositório:
   ```bash
   git clone https://github.com/AndreYurii/elevate-tech-backend.gitch-backend