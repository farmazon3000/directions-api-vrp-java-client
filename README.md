# GraphHopper Route Optimization API

## Java Client

This client was automatically created from [this swagger specification](https://graphhopper.com/api/1/vrp/swagger.json)
via swagger codegen 2.1.3

## Usage

See the [examples](https://github.com/karussell/directions-api-vrp-java-client/tree/master/src/main/java/com/graphhopper/api/vrp/example) on how to use this client.

## Maven
This vrp client is now in the central repository, thus you can just reference it in your pom like:

```xml
<dependency>
  <groupId>com.graphhopper</groupId>
  <artifactId>directions-api-vrp-java-client</artifactId>
  <version>0.5.0.0</version>
</dependency>
```

## Customization

If you want to build it from source do:
```
git clone https://github.com/karussell/directions-api-vrp-java-client.git
cd directions-api-vrp-java-client/
mvn install
```

To update the sources from your spec follow [this guide](https://github.com/swagger-api/swagger-codegen) to create the Java 
sources from [this spec](https://graphhopper.com/api/1/vrp/swagger.json). E.g. via:
```java
cd swagger-codegen
java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i https://graphhopper.com/api/1/vrp/swagger.json -l java -o ../vrp-client
```


## Other Clients

The other parts of the API are currently covered in a [separate repository](https://github.com/graphhopper/directions-api-java-client) (for Java). 

Clients in other languages are listed [here](https://github.com/graphhopper/directions-api/blob/master/README.md#api-clients-and-examples).

## License

This project stands under the Apache License 2.0
