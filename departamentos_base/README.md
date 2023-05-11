# Departamentos

Aplicação back-end implementada com Spring Boot, JSON sobre HTTP.

Resolve os seguintes "paths":

/departamentos

/departamentos/{depId}

/departamentos/{depId}/funcionarios/

/departamentos/{depId}/funcionarios/{funcID}

Os departamentos tem id e nome.

Os funcionários tem id, nome e salário.

Implementa GET em todos os paths.

Implementa POST em /departamentos e em /departamentos/{depId}/funcionarios/

Implementa PUT e DELETE em /departamentos/{depId} e em /departamentos/{depId}/funcionarios/{funcID}

Inicie o projeto com `mvn spring-boot:run`. 

Abra o browser em <http://localhost:8080/swagger-ui.html> para ver a documentação gerada automaticamente.

