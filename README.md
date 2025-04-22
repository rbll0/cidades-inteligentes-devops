# ✦️ Cidades Inteligentes

Este projeto é uma API desenvolvida com **Spring Boot**, utilizando banco de dados **H2 em memória**. A aplicação está containerizada com **Docker** e conta com um pipeline de **CI/CD configurado com GitHub Actions**.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- H2 Database
- Maven
- Docker
- GitHub Actions

---

## 📁 Estrutura do Projeto

```
 src
 ├── 📂 main
 │ ├── 📂 java
 │ └── 📂 resources
 │     ├── 📄 application.yml
 └── 📂 test
📄 Dockerfile
📄 docker-compose.yml
📄 pom.xml
```

---

## ⚙️ Como rodar o projeto

### 1. Clonar o repositório
```bash
git clone https://github.com/SEU-USUARIO/cidades-inteligentes-devops.git
cd cidades-inteligentes-devops
```

### 2. Rodar com Docker Compose
```bash
docker compose up --build
```

A aplicação estará disponível em:
```
http://localhost:8080
```

Console H2:
```
http://localhost:8080/h2-console
```

---

## 🔄 CI/CD com GitHub Actions

Este projeto conta com um workflow que executa:

1. Checkout do código
2. Build com Maven
3. Login no DockerHub
4. Build da imagem Docker
5. Push da imagem para o DockerHub

O arquivo do pipeline está em:  
`.github/workflows/ci-cd.yml`

---

## 📦 DockerHub

A imagem Docker é automaticamente enviada para o DockerHub a cada push na branch `main`.

📦 Repositório DockerHub:  
`https://hub.docker.com/repository/docker/whodatgu/cidades-inteligentes/general`

---

## 📛 Integrantes

- **Diego Silva Cavalcanti** - RM: 553351
- **Kaio de Souza Barbosa** - RM: 553983
- **Vinícius de Souza Barbosa** - RM: 553998
- **Mateus Galeazi de Oliveira** - RM: 553352
- **Gustavo Rabelo Frere** - RM: 553326

---


