# User Profle API

## API integration document

This Restful API is created to be consumed by mobile apps and web channel. API provides methods to create,update, delete user profiles. API is developed using swagger and Java Spring Boot. API has four methods  “POST” method for creating user profile, “Put” for updating user Profile, “DELETE” for deleting user profile and “GET” for accessing user profile. API contract definition is written using swagger and is in git repo. API can be easily containerized using DockerFile at the root of the sources directory.

## API contract Definition
Api contract definition are in `swagger-api-definition` file.

## build instructions
Use maven plugin to build

cd into `user-profile-api` diretory
run `mvn install` 

This should build jar file in target directory.

To create Docker image
run `docker build -t <image name>`



