# Spring Boot + Secured REST Endpoints Tutorial

Simple tutorial to demonstrate how to secure REST endpoints in your Spring Boot service
The user and password are in application.properties (obviously, not suited for your prod environment). 

## Running locally

To build:

```
> ./gradlew clean build
```

Then to run:
```
> java -jar build/libs/hello-springboot-hsbrs-0.1.0.jar
```

or combined:
```
./gradlew clean build && java -jar build/libs/hello-springboot-hsbrs-0.1.0.jar
```

The user name and password are defined in the _application.properties_
```
security.user.name=user
security.user.password=password
```

To test using a browser:

http://localhost:8080/hello

Then login with the credentials

Or if using curl:

```
curl -u user:password http://localhost:8080/hello
```

Try it without the credentials, you should get 401 error

```
curl http://localhost:8080/hello
```

## Other Tech notes
* Security is global-enabled simply by just including the starter security in your build path

```
compile('org.springframework.boot:spring-boot-starter-security')
```


