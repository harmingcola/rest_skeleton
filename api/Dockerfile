FROM buildit/ms-base

MAINTAINER Fabrizio Torelli <fabrizio.torelli@wipro.com>

ARG MS_VERSION

USER root

ENV APP_ROOT=/root/app
ENV PATH=/root/bin:/root/maven/apache-maven-3.5.0/bin:$PATH
ENV APP_ENV=DEV
ENV JAVA_MIN_HEAP=256m
ENV JAVA_MAX_HEAP=1G
ENV JAVA_OPTS="-Xss256k -Djna.nosys=true -XX:+UseParNewGC -XX:+UseConcMarkSweepGC -XX:CMSInitiatingOccupancyFraction=75 -XX:+UseCMSInitiatingOccupancyOnly -XX:+HeapDumpOnOutOfMemoryError"
ENV PORT=8080
ENV RECRUITMENT_DOCKER_VERSION=
ENV RECRUITMENT_VERSION=
ENV RECRUITMENT_API_VERSION=
ENV RECRUITMENT_MODEL_VERSION=
ENV PATH=$PATH:/root/bin

RUN mkdir -p /root/bin
RUN mkdir -p /root/app

COPY files/run-microservice.sh /root/bin/run-microservice

COPY files/keystore.jks /root/app/keystore.jks

COPY files/certificate.pem /root/app/certificate.pem

COPY files/certificate.pem /etc/ssl/certs/lbg-vanilla.cert

RUN mkdir -p /root/app/logs
RUN  mkdir -p /root/app/tmp
RUN  chmod +x /root/bin/run-microservice
RUN  update-ca-certificates

COPY target/vanilla-recruitment-api-$MS_VERSION.jar /root/app/vanilla-recruitment-api.jar

WORKDIR $APP_ROOT

VOLUME ["/root/app/logs","/root/app/tmp"]

ENTRYPOINT ["/bin/bash", "-c",  "chmod 777 /root/bin/run-microservice && run-microservice"]

EXPOSE 8080
