# spring-boot-template
A starting point for all future TIE Spring Boot 2 Projects

## Important
Do not store passwords inside src/main/resources or they will be included in production builds!

## Get Started
1. clone
2. import build.gradle in IDEA -> as new project
3. enjoy

To use your own local configuration make a copy of application.yml in src/test/resources and add param --spring.config.location=<...>/application.yml to your idea run config

## Config
bootstrap.yml contains the minimal options to run and should be equal across all projects
application.yml contains app specific options, all custom (self-defined) properties must be commented, *DO NOT STORE PASSWORDS HERE*

## Production Deployment
Follow the official deployment guide. Configurations in bootstrap.yml and application.yml will be ignored.

# API Template
To run with hedev use:
--spring.config.location=<project>\src\main\resources\bootstrap.yml,<project>\src\test\resources\application-hedev.yml
