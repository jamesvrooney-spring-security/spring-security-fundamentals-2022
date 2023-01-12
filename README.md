# Spring Security Fundamentals 2022

## Course Details
[Spring Security Fundamentals 2022 | YouTube](https://www.youtube.com/playlist?list=PLEocw3gLFc8X_a8hGWGaBnSkPFJmbb8QP)

## Lesson 11: The OAuth2 Authorization Server
[Lesson 11 Video - The OAuth2 Authorization Server](https://www.youtube.com/watch?v=asAUMpEcdXw&list=PLEocw3gLFc8X_a8hGWGaBnSkPFJmbb8QP&index=10)

[Code for Lesson 11 on GitHub](https://github.com/lspil/youtubechannel/tree/master/ss_2022_c11_e1)

## Docker Compose
>**Run postgres in a docker container**  
`docker-compose up`  
`docker-compose up db`

>**Exec into postgres container**  
`docker exec -it jamesvrooney-postgres /bin/sh`

>**Use postgres cli (within the container):**  
`psql -U postgres`


## Query for OAuth2 access code
`code_verifier:  MtrhkMEVqDsXVSzr4oJqW3kMFchRfgOIZ1TzjGsmIH4`

`code_challenge:  If6bHFhC6sDG9crEksQAE4owI2zL0r2nz2ErFcFXmlU` 

`localhost:8080/oauth2/authorize?response_type=code&client_id=client&scope=openid&redirect_uri=https://springone.io/authorized&code_challenge=If6bHFhC6sDG9crEksQAE4owI2zL0r2nz2ErFcFXmlU&code_challenge_method=S256`
