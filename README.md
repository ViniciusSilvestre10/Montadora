# Estudo de Arquitetura Spring: Gerenciamento de Beans e Injeção

Este projeto foi desenvolvido com o objetivo de aprofundar os conhecimentos sobre o ecossistema **Spring Framework**, focando especificamente na configuração de **Beans**, resolução de ambiguidades e criação de **Anotações Customizadas**.

## 🚀 O que este projeto explora?

O projeto simula o funcionamento de uma montadora de carros, onde diferentes tipos de motores são instanciados e injetados de forma dinâmica conforme a necessidade da aplicação.

### Conceitos Chave:

*   **`@Configuration` & `@Bean`**: Demonstra como definir instâncias de objetos manualmente para que o Spring as gerencie no ApplicationContext.
*   **Desambiguação**: Uso de nomes de Beans e Qualificadores para lidar com múltiplas implementações do mesmo tipo (`Motor`).
*   **Custom Annotations**: Criação de anotações personalizadas (como a `@Aspirado`) para encapsular o `@Qualifier`, tornando o código mais limpo e menos propenso a erros de digitação.
*   **Injeção de Dependência**: Uso do `@Autowired` para desacoplar a criação dos componentes da sua utilização final.

---

## 🛠️ Estrutura do Código

### 1. Configuração Centralizada
No arquivo `MontadoraConfiguration`, os Beans são definidos com estados específicos (cavalaria, cilindros, modelo), simulando diferentes produtos de uma fábrica.

### 2. Especialização com Anotações
Foi criada uma interface de anotação para facilitar a injeção do motor específico:

```java
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Qualifier("motorAspirado")
public @interface Aspirado { }
```
### 3. Ponto de Injeção (Controller)
   O controlador recebe a dependência injetada de forma elegante, utilizando a anotação customizada para determinar qual motor será utilizado na lógica de ignição.

```java
@Autowired
@Aspirado
private Motor motor;
```
### 👨‍💻 Tecnologias

* Java (versão 17+)
* Spring Boot 3
* Spring Web