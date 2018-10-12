#!/bin/sh
mvn clean package && docker build -t at.htl.nvs.micro/micro .
docker rm -f micro || true && docker run -d -p 8080:8080 -p 4848:4848 --name micro at.htl.nvs.micro/micro