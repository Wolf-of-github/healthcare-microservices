# Healthcare Microservices Platform

A cloud-native healthcare management system built using a **microservices architecture** to manage patient records, appointments, and billing services.

The system is developed with **Spring Boot and Spring Cloud**, with services communicating through **REST APIs and Kafka-based event streaming**. APIs are secured using **OAuth2 and JWT authentication** to ensure controlled access to sensitive healthcare data.

Patient and medical data are stored in **MongoDB**, with schemas designed to support both structured patient information and unstructured medical records. Integration with third-party EHR systems is handled through **Kafka for streaming** and **Feign Clients for service-to-service communication**.

All services are containerized using **Docker** and deployed with **Kubernetes**, enabling scalability, resilience, and efficient orchestration.

**Tech Stack:**  
Java (Spring Boot, Spring Cloud), MongoDB, Kafka, Feign Client, REST APIs, OAuth2, JWT, Docker, Kubernetes, Jenkins
