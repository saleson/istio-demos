FROM java:8-alpine
## 设置时区
RUN apk add -U tzdata
RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
## 设置输出格式
ENV LANG en_US.UTF-8
ENV LANGUAGE en_US:en
ENV LC_ALL en_US.UTF-8

LABEL usage=istio-demo

MAINTAINER saleson
ADD istio-springboot-demo-b-1.0-SNAPSHOT.jar demo-b-app.jar
EXPOSE 8081
ENTRYPOINT exec java -Xmx32m -Xms32m -Xmn32m -Xss256k -jar demo-b-app.jar --spring.profiles.active=dev
# ENTRYPOINT ["java","-jar","demo-a-app.jar"]
#CMD java  -Xmx32m -Xms32m -Xmn32m -Xss256k -Djava.security.egd=file:/dev/./urandom -Dfile.encoding=UTF8 -Dsun.jnu.encoding=UTF8 -Duser.timezone=GMT+8 -jar demo-a-app.jar --spring.profiles.active=dev
# CMD java -Xmx32m -Xms32m -Xmn32m -Xss256k -jar demo-a-app.jar --spring.profiles.active=dev