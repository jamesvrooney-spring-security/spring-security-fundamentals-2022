### [Main Docs](../README.md)

## Kubernetes Support
- Run Minikube locally
    - minikube start

- [How to Run Locally Built Docker Images in Kubernetes](https://medium.com/swlh/how-to-run-locally-built-docker-images-in-kubernetes-b28fbc32cc1d)
    - ``` eval $(minikube -p minikube docker-env) ```
    - ``` mvn spring-boot:build-image ```
    - ``` kubectrl apply -f k8s-local.yml ```
- ```minikube dashboard```
    - Let's you view your cluster in browser
- ``` minikube service list ```
    - Show services configured
- ``` minikube service <service_name> ```
    - Access the servive via browser
- ``` k exec -it webapp -- bash ```
    - Let's you get a shell inside running pod