# spring-boot-template
A starting point for all future TIE Spring Boot 2 Projects

## Get Started
1. clone
2. import build.gradle in IDEA -> as new project
3. enjoy

## Config
bootstrap.yml contains the minimal options to run and should be equal across all projects
application.yml contains app specific options, all custom (self-defined) properties must be commented, *DO NOT STORE PASSWORDS HERE*

## Run in development
If necessary, make a local copy of application.yml outside the resource folder and add param --spring.config.location=<location>/application.yml to your run config

## Production Deployment
Follow the official deployment guide. Configurations in bootstrap.yml and application.yml will be ignored.
