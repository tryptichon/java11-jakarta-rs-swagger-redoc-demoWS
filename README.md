# DEMO WS

An Jakarta-JAX-RS skeleton webapp using:

* Jakarta-JAX-RS with annotations.
* Swagger annotations for automatic openapi.json/.yaml generation.
* ReDoc standalone to generate a documentation website for the api.
* Docker to create a self-contained image using tomcat 10.

Best to be used with IntelliJ IDEA and Java 11.

## Handling docker images

Using maven to handle docker image creation and cleanup is done by just activating the profile `docker`. This
can be activated via `-Ddocker=true` on the commandline.

Create a docker image:

```shell
mvn package -Ddocker=true
```

Cleanup and remove the docker image:

```shell
mvn clean -Ddocker=true
```

See [pom.xml](pom.xml) on how this is done.

A sample [docker-compose.yaml](docker/docker-compose.yaml) is included to start a container easily. The
parameter `image` there needs to be adjusted by hand when the project name / version changes.

After the container has started, point your browser to `http://localhost:8080/`.

## Used tools and licenses

For more information about swagger and additional licenses:

#### Swagger

* [Swagger IO](https://swagger.io/)
* [License](https://swagger.io/license/)

#### ReDoc

* [GitHub](https://github.com/Redocly)
* [Official website](https://redocly.com/redoc)
* [Demo site](https://redocly.github.io/redoc/)
* [License](https://github.com/Redocly/redoc/blob/master/LICENSE)

#### Docker

* [Official website](https://www.docker.com/)
* [FAQ about licensing and pricing](https://www.docker.com/pricing/faq/)

#### Tomcat

* [Official website](https://tomcat.apache.org/)
* [License](https://tomcat.apache.org/legal.html)