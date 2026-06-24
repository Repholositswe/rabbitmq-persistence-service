# RabbitMQ Persistence Service

A Spring Boot application that reads messages from RabbitMQ and saves them into an H2 database.

## What this application does

This application:

* Connects to RabbitMQ
* Listens for messages from a queue
* Receives messages using a consumer
* Saves received messages into an H2 database
* Uses JDBC to communicate with the database
* Uses service and repository layers to handle data

## Tech Stack

* Java
* Spring Boot
* RabbitMQ
* H2 Database
* JDBC
* Maven

