#/bin/sh

CODEGEN_VERSION="0.0.30"
CODEGEN_JAR=~/wutsi-codegen/wutsi-codegen-${CODEGEN_VERSION}.jar

API_NAME=user
API_URL=https://wutsi-openapi.s3.amazonaws.com/${API_NAME}_api.yaml
GITHUB_USER=wutsi


echo "Generating code from ${API_URL}"
java -jar ${CODEGEN_JAR} sdk \
    -in ${API_URL} \
    -out . \
    -name ${API_NAME} \
    -package com.wutsi.${API_NAME} \
    -jdk 11 \
    -github_user ${GITHUB_USER} \
    -github_project ${API_NAME}-sdk-kotlin

if [ $? -eq 0 ]
then
    echo Code Cleanup...
    mvn antrun:run@ktlint-format
    mvn antrun:run@ktlint-format

else
    echo "FAILED"
    exit -1
fi
