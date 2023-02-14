### [Main Docs](../README.md)

## Database Support
### Database config: src/main/resources/application.yml
```
spring:
  output.ansi.enabled: always

  datasource:
    url: jdbc:postgresql://localhost:5432/spring-security-fundamentals-2022
    username: postgres
    password: postgres

  jpa:
    properties.hibernate:
      dialect: org.hibernate.dialect.PostgreSQLDialect
```

---

### docker compose file snippet for Postgres DB
```
services:
  db:
    image: postgres:15.1
    container_name: jamesvrooney-postgres
    restart: always
    environment:
      - POSTGRES_USER=postgres
      - POSTGRES_PASSWORD=postgres
    ports:
      - '5432:5432'
    volumes:
      - db:/var/lib/postgresql/data
volumes:
  db:
    driver: local
```

>**Exec into postgres container**  
`docker exec -it jamesvrooney-postgres /bin/sh`

>**Use postgres cli (within the container):**  
`psql -U postgres`