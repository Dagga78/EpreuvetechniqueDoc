#!/bin/sh
mvn clean package && docker build -t com.mycompany/SystemeBancaireWSClient .
docker rm -f SystemeBancaireWSClient || true && docker run -d -p 8080:8080 -p 4848:4848 --name SystemeBancaireWSClient com.mycompany/SystemeBancaireWSClient 
