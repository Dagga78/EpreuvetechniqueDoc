#!/bin/sh
mvn clean package && docker build -t com.mycompany/SystemeBancaireWS .
docker rm -f SystemeBancaireWS || true && docker run -d -p 8080:8080 -p 4848:4848 --name SystemeBancaireWS com.mycompany/SystemeBancaireWS 
