# Spring Security Fundamentals 2022

## Course Details
[Spring Security Fundamentals 2022 | YouTube](https://www.youtube.com/playlist?list=PLEocw3gLFc8X_a8hGWGaBnSkPFJmbb8QP)

## Lesson 01: First steps
[Lesson 01 Video - First Steps](https://www.youtube.com/watch?v=nSu9ElsnNtY&list=PLEocw3gLFc8X_a8hGWGaBnSkPFJmbb8QP)

[Code for Lesson 01 on GitHub](https://github.com/lspil/youtubechannel/tree/master/ss_2022_c1_e1)

## Build Image
```
mvn spring-boot:build-image
```
## Docker Compose
>**Run app in a docker container**  
`docker compose up app -d`


## Kubernetes Support
- Run Minikube locally
  - minikube start
 
- [How to Run Locally Built Docker Images in Kubernetes](https://medium.com/swlh/how-to-run-locally-built-docker-images-in-kubernetes-b28fbc32cc1d)
  - ``` eval $(minikube -p minikube docker-env) ```
  - ``` mvn spring-boot:build-image ```
  - ``` kubectrl apply -f k8s-local.yml ```
- ```minikube dashboard```
  - Let's you view your cluster in browser