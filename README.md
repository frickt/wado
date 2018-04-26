# spring-boot-template
A starting point for all future TIE Spring Boot 2 Projects

## Important
* Do not edit bootstrap.yml, make local changes as explained below

## Get Started
1. Fork and clone
2. import build.gradle in IDEA -> as new project
3. to apply your own local config copy bootstrap.yml to bootstrap-dev.yml or use commandline params
4. keep all mandatory config properties in application-default.yml, use application-dev.yml for a local config
5. use example values in application-default.yml and add comments to custom properties
6. enjoy

## Content
* Based on spring.io starter
* Ivy-Repo
* Spring Cloud, Actuator, Web and Test dependencies
* logback-spring.xml integration
* TIE GitFlow plugin
