# spring-boot-template
A starting point for all future TIE Spring Boot 2 Projects

## Important
Do not store passwords inside src/main/resources or they will be included in production builds!

## Get Started
1. clone
2. import build.gradle in IDEA -> as new project
3. enjoy

To add a test configuration make a copy of application.yml in src/test/resources and add param --spring.config.location= with both the bootstrap and application file
i.e. --spring.config.location=<project>\src\main\resources\bootstrap.yml,<project>\src\test\resources\application.yml
This mocks the production environment where the application config will be loaded from the config server, overwriting bootstrap.yml where applicable

For a personal configuration link to a copy outside the project


## Config
bootstrap.yml contains the minimal options to run and should be equal across all projects
application.yml contains app specific options, all custom (self-defined) properties must be commented, *DO NOT STORE PASSWORDS HERE*

## Production Deployment
Follow the official deployment guide. Configurations from bootstrap.yml and application.yml will be ignored.
