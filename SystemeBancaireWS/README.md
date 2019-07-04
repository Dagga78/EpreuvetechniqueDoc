# Build
mvn clean package && docker build -t com.mycompany/SystemeBancaireWS .

# RUN

docker rm -f SystemeBancaireWS || true && docker run -d -p 8080:8080 -p 4848:4848 --name SystemeBancaireWS com.mycompany/SystemeBancaireWS 