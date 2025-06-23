### Proyecto Taco Cloud 🌮

Este proyecto está basado en el libro spring in action.Actualmente,  estamos aprendiendo los fundamentos de spring mvc.Por ahora, el proyecto crea una lista de ingredientes cargada en memoria, y se renderizan en plantillas th.

### Tecnologías utilizadas

- Java 17
- Spring Boot
- Spring MVC
- Thymeleaf

### Aprendizajes clave

- Uso de `@ModelAttribute` para compartir datos entre controladores y vistas.
- Creación de listas en memoria usando `Arrays.asList(...)`. 
- `@SessionAttributes` en Spring MVC sirve para guardar atributos del modelo en la sesión HTTP durante múltiples solicitudes (request), en lugar de que se pierdan después de una sola petición.

### Modelo: Taco

Representa el taco que vamos a armar.

- `name`: es el nombre del taco.
- `ingredients`: Esta es la lista de ingredientes que se agregan a el taco.


### Modelo: Ingredient


Representa un ingrediente que puede ser parte de un taco.

- `id`: código del ingrediente (ej: "CHED")
- `name`: nombre descriptivo (ej: "Chedar")
- `type`: enum `Type` que indica si es proteína, salsa, etc.


### Modelo: TacoOrder

Representa una orden realizada por un cliente. Incluye información personal, detalles de envío y los tacos seleccionados.

#### Campos:

- `name`: Nombre del cliente
- `address`: Dirección completa (street, city, state, zip)
- `payment`: Datos simulados de tarjeta (número, expiración, CVV)
- `tacos`: Lista de tacos incluidos en la orden

Este modelo se utiliza como `@SessionAttributes` para conservar el estado durante un formulario de varios pasos, este debe relacionarse con un `@ModelAttribute` 


### Controller 