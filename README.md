# 💎 Back-Cesde: API Joyería

Este es el backend del proyecto de gestión para una **Joyería**, desarrollado como parte del programa académico en **CESDE**. La API permite administrar el inventario de piezas de lujo, clientes, ventas y pedidos.

---

## 📋 Tabla de Contenidos
- [Descripción](#-descripción)
- [Tecnologías Utilizadas](#-tecnologías-utilizadas)
- [Arquitectura](#-arquitectura)
- [Requisitos Previos](#-requisitos-previos)
- [Instalación y Ejecución](#-instalación-y-ejecución)
- [Endpoints Principales](#-endpoints-principales)

---

## 📖 Descripción
Esta API construida con **Spring Boot** proporciona una solución integral para el control de stock de una joyería. Incluye funcionalidades para la categorización de productos (Oro, Plata, Relojería), gestión de precios y autenticación de usuarios.

## 🛠️ Tecnologías Utilizadas
* **Lenguaje:** Java 17+
* **Framework:** Spring Boot 3.x
* **Gestión de Dependencias:** Maven
* **Persistencia:** Spring Data JPA
* **Base de Datos:** [MySQL / PostgreSQL / H2]
* **Seguridad:** Spring Security & JWT (opcional)
* **Documentación:** Swagger / OpenAPI

## 🏗️ Arquitectura
El proyecto sigue un patrón de diseño de capas estándar:
1. **Controller:** Manejo de peticiones HTTP.
2. **Service:** Lógica de negocio.
3. **Repository:** Interacción con la base de datos a través de JPA.
4. **Entity:** Modelado de objetos (Producto, Cliente, Venta).

## ⚙️ Requisitos Previos
- JDK 17 o superior instalado.
- Maven 3.6+ instalado.
- Tu IDE preferido (IntelliJ IDEA, Eclipse o VS Code).

## 🚀 Instalación y Ejecución

1. **Clona el repositorio:**
   ```bash
   git clone [https://github.com/Jadamartinez02/Back-Cesde.git](https://github.com/Jadamartinez02/Back-Cesde.git)
   ```

2. **Entra al directorio:**

```Bash
cd Back-Cesde
```
3. **Compila e instala las dependencias:**

```Bash
mvn clean install
```
3. **Ejecuta la aplicación:**

```Bash
mvn spring-boot:run
```
🛣️ Endpoints Principales (Ejemplos)

Método,Endpoint,Descripción
GET,/api/productos,Lista todas las joyas en inventario.
GET,/api/productos/{id},Detalle de una joya específica.
POST,/api/productos,"Registra una nueva pieza (anillo, reloj, etc)."
POST,/api/ventas,Registra una nueva transacción de venta.
DELETE,/api/productos/{id},Elimina un producto del catálogo.
