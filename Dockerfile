FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# 复制 jar 包
COPY --from=builder /app/build/libs/test-cicd-0.0.1-SNAPSHOT.jar app.jar

# 暴露端口
EXPOSE 8080


# 启动应用
ENTRYPOINT ["java", "-jar", "app.jar"]
