### Products API
  Aplicación creada con Springboot(2.1.0.RELEASE) y los módulos:
  - spring-boot-starter-data-mongodb
  - spring-boot-starter-web
  - spring-boot-devtools

#### Database: MongoDB
En el ```application.properties``` se define:

```
spring.data.mongodb.database=jsa_mongodb
spring.data.mongodb.port=27017
```
Por lo que se debe contar con el servicio de mongoDB con los parámetros por defecto. [Centro de descargar de MongoDB](https://www.mongodb.com/download-center/community)

#### Logging: Logback
La aplicación deja una traza en ```C:/dev/products/log/```, en caso de no existir, este directorio se creará al iniciar la aplicación.
De acuerdo con la configuracion de ```logback.xml``` en el folder resources:
  - Se crean 2 archivos de acuerdo con el _Layout_: archivo plano y html. 
  - Ambos cuentas con una politica de rodamiento cada 10Mb.
  - Los mismos archivos archivos se guardan hasta un total de 100 unidades cada una o un plazo máximo de 30 dias.

#### [Insertar un producto](http://localhost:8080/api/create)
  - Endpoint: http://localhost:8080/api/create
  - Method: _POST_
  - Header: Content-Type=_application/json_
  - Body:
```
{
	"name": "Product name example",
	"price": 99.99,
	"brand": "Product brand",
	"categoryId": 123
}
```
  - Response: El objeto creado.

#### [Obtener todos los productos](http://localhost:8080/api/products)
  - Endpoint: http://localhost:8080/api/products
  - Method: _GET_
  - Response:
```
[{
	"id": "5bf56394255ba017ec1dd0a0",
	"name": "Product name example",
	"price": 99.99,
	"brand": "Product brand",
	"categoryId": 123
}]
```
