
Challenge ONE - Java - Back End
---

```markdown
```
# Conversor de Monedas 💱

Aplicación de consola desarrollada en Java que permite convertir montos entre diferentes monedas utilizando la [ExchangeRate-API](https://www.exchangerate-api.com/).

## 🚀 Funcionalidades

- Conversión entre las siguientes monedas:
  - USD (Dólar Estadounidense) → ARS (Peso Argentino) / ARS → USD
  - USD → JPY (Yen Japonés) / JPY → USD
  - USD → KRW (Won Surcoreano) / KRW → USD
- Interfaz de menú interactivo por consola
- Uso de la API ExchangeRate con `HttpClient`
- Procesamiento de respuestas JSON usando `Gson`

## 📋 Requisitos

- Java 11 o superior
- Biblioteca Gson

## 🛠️ Cómo ejecutar

1. Cloná este repositorio:
   ```bash
   git clone https://github.com/tu-usuario/conversor-de-monedas.git
   ```

2. Agregá la dependencia de Gson. Si no usás Maven o Gradle, podés descargar el `.jar` desde [aquí](https://github.com/google/gson) y agregarlo manualmente a tu proyecto.

3. Agregá tu clave de API en la clase `ExchangeRateService`:

   ```java
   private static final String API_KEY = "TU_API_KEY_AQUI";
   ```

4. Ejecutá la clase `Main` para comenzar a usar el conversor.

## 🔐 API

La app utiliza [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener tasas de cambio en tiempo real.

## 🧠 Aprendizajes

Este proyecto fue desarrollado como parte de un desafío de aprendizaje y sirvió para practicar:

- Consumo de APIs externas
- Lógica condicional con `switch`
- Manejo de entradas con `Scanner`
- Deserialización de JSON con `Gson`
- Manejo de errores y excepciones en Java

## ✅ Estado del Proyecto

✔️ Proyecto finalizado y funcional.  
📌 Desarrollado como parte del desafío de Oracle + Alura.

---

Gracias por visitar el proyecto 🙌
