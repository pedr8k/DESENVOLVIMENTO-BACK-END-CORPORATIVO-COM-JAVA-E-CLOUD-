# 📚 DESENVOLVIMENTO BACK-END CORPORATIVO COM JAVA E CLOUD

## Projeto: Sistema Cadastral JEE (CadastroEE)

### 🎯 Objetivo do Projeto

Implementação de uma aplicação corporativa multicamadas utilizando a plataforma **Jakarta EE (JEE)**, com o objetivo de criar um sistema cadastral simples.

**Tecnologias Utilizadas:**

* **Servidor:** GlassFish Server 6.2.1
* **Persistência:** JPA (Java Persistence API) com EclipseLink
* **Lógica de Negócio:** EJBs (Enterprise JavaBeans) - Session Beans
* **Banco de Dados:** SQL Server

---

### ✅ STATUS DE DESENVOLVIMENTO

O desenvolvimento foi **paralisado** na Fase 1 (Camada de Controle) devido a erros críticos de ambiente que impediram a compilação do projeto.

| Camada | Status | Observações |
| :--- | :--- | :--- |
| **Infraestrutura** | ✅ Completo | Conexão JDBC, Pool de Conexões (`jdbc/loja`) e estrutura modular criados com sucesso. |
| **Persistência (JPA)** | ✅ Completo | Entidades (`Pessoa`, `Produto`) e `persistence.xml` criados e corrigidos manualmente. |
| **Controle (EJB)** | ⚠️ **Bloqueado** | Session Beans (`*Facade` e `AbstractFacade`) criados manualmente, mas o módulo **não compila**. |
| **Interface (Servlets/JSP)** | ❌ Não Iniciado | Dependente da compilação do módulo EJB. |

---

### 🚨 JUSTIFICATIVA DE PARALISAÇÃO (Bloqueio de Compilação)

O projeto foi interrompido devido a falhas persistentes de infraestrutura na IDE **NetBeans** que não puderam ser resolvidas, mesmo após extenso *troubleshooting* e correção manual do código.

**Detalhes da Falha:**

* **Erros Iniciais:** A IDE falhou consistentemente em usar assistentes de produtividade (Wizards) para gerar Entidades e Session Beans, exigindo a criação manual de todas as classes.
* **Bloqueio Final:** O projeto falhou em compilar devido à **perda da referência da biblioteca Java Persistence API (JPA)** no projeto `CadastroEE-ejb`. Este é um **erro de configuração do ambiente (classpath)** que impede o reconhecimento de classes essenciais como `javax.persistence.criteria.CriteriaQuery`.

A correção deste erro de dependência é um problema de configuração da IDE, tornando **extremamente difícil e confuso de continuar** o desenvolvimento. O código e o relatório técnico completo justificando o impedimento foram enviados neste repositório.

---

### 📂 ESTRUTURA E LOCALIZAÇÃO DE ARQUIVOS

* **Entidades:** `CadastroEE-ejb/src/java/cadastroee/model/Pessoa.java` e `Produto.java`
* **Controle (EJB):** `CadastroEE-ejb/src/java/cadatroee/controller/*Facade.java`
* **Configuração de Persistência:** `CadastroEE-ejb/src/conf/persistence.xml`
