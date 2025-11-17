# 📚 Sistema de Biblioteca – Spring Boot + Angular

Este projeto é um sistema completo de gerenciamento de **Autores** e **Livros**, desenvolvido com:

- **Spring Boot** (Back-end)
- **Angular** (Front-end)
- **Banco de dados H2**
- **APIs REST**
- **Integração Full Stack**

O objetivo foi construir uma aplicação CRUD funcional, moderna e organizada, com foco no aprendizado de arquitetura full stack.

---

## 🚀 Tecnologias Utilizadas

### **Back-end (Java + Spring Boot)**
- Spring Web  
- Spring Data JPA  
- Spring Boot DevTools  
- Banco H2  
- Maven  

### **Front-end (Angular + TypeScript)**
- Angular CLI  
- Node.js  
- Bootstrap (interface)  
- HttpClient (para consumir a API)

---

## 🏛️ Arquitetura do Projeto
BibliotecaCrud/
│
├── backend/
│ ├── src/main/java/com/biblioteca/
│ │ ├── controller/
│ │ ├── model/
│ │ ├── repository/
│ │ └── service/
│ └── src/main/resources/
│ └── application.properties
│
└── frontend/
├── src/app/
│ ├── pages/
│ │ ├── autores-listar/
│ │ ├── autores-cadastrar/
│ │ ├── autores-editar/
│ │ ├── livros-listar/
│ │ ├── livros-cadastrar/
│ │ └── livros-editar/
└── app.routes.ts

---

## ⚙️ Como Executar o Backend (Spring Boot)

1️⃣ Entre na pasta:
2️⃣ Execute o projeto:
mvn spring-boot:run
3️⃣ O servidor iniciará em:
http://localhost:8080
4️⃣ Console H2:
http://localhost:8080/h2-console
🚨 **IMPORTANTE:**
Use o JDBC correto exibido no console.

---
## 💻 Como Executar o Frontend (Angular)
1️⃣ Entre na pasta do frontend:
2️⃣ Execute: npm install
3️⃣ Inicie o servidor Angular:ng serve
4️⃣ Acesse no navegador: http://localhost:4200

---

## 🔄 Endpoints da API (Spring)

### **Autores**
| Método | Endpoint            | Função               |
|--------|----------------------|-----------------------|
| GET    | /autores             | Lista todos          |
| POST   | /autores             | Cadastra novo        |
| PUT    | /autores/{id}        | Atualiza autor       |
| DELETE | /autores/{id}        | Exclui autor         |

### **Livros**
| Método | Endpoint            | Função               |
|--------|----------------------|-----------------------|
| GET    | /livros              | Lista todos          |
| POST   | /livros              | Cadastra novo        |
| PUT    | /livros/{id}         | Atualiza livro       |
| DELETE | /livros/{id}         | Exclui livro         |

---

## 🖼️ Prints do Sistema

<img width="727" height="683" alt="Autores" src="https://github.com/user-attachments/assets/bcf9dc49-c570-483c-a0e2-23f7a211390b" />
<img width="733" height="693" alt="Livros" src="https://github.com/user-attachments/assets/908eba32-f9bf-4682-acda-bf596d829420" />
## 📘 Conceitos Aprendidos

- Criação de API REST com Spring Boot  
- Consumo de API usando Angular HttpClient  
- CRUD completo para duas entidades (Autor e Livro)  
- Relacionamento entre entidades (Livro → Autor)  
- Exibição de dados relacionados no Angular  
- Organização modular com componentes, services e rotas  
- Deploy local com H2 e Node.js  

## 👨‍💻 Autor
Mauro Pereira 
https://github.com/MauroSergio61
https://www.linkedin.com/in/mauro-sergio1861/
--- ## 📄 Licença

Este projeto é livre para estudo e fins acadêmicos.  

