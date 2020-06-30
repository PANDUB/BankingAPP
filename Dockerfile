From openjdk:8
Expose 8080
add build/libs/BankingAPP-1.0-SNAPSHOT.jar BankingAPP-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/BankingAPP-1.0-SNAPSHOT.jar"]