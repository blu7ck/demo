# Java 21 JRE kullanarak baz imajı seçin
FROM openjdk:21-jdk


# Uygulama dizinine geç
WORKDIR /app

# Uygulama jar dosyasını kopyala
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Uygulamayı çalıştır
ENTRYPOINT ["java", "-jar", "app.jar"]
