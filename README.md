# Mi Primera Aplicación (Android / Kotlin) 📱

Este proyecto es una aplicación nativa de Android desarrollada en **Kotlin** que demuestra la navegación entre múltiples pantallas (Activities) y el intercambio de datos entre ellas.

El objetivo principal es implementar un flujo de 5 actividades utilizando **Intents** explícitos, **View Binding** para la gestión de vistas y la **Activity Result API** para devolver datos de un formulario.

## 🚀 Características Principales

La aplicación consta de 5 pantallas interconectadas:

### 1. Login (Activity Principal)
* Formulario de entrada para Usuario y Contraseña.
* Validación de campos vacíos.
* Navegación al "Inicio" enviando el nombre de usuario introducido.

### 2. Inicio (Home)
* Recibe y muestra el nombre del usuario desde el Login.
* Menú de navegación hacia tres secciones: Contacto, Sobre Nosotros y Localización.
* **Recepción de datos:** Espera y muestra la información retornada desde la pantalla de Contacto.

### 3. Contacto
* Formulario con Nombre, Email y Mensaje.
* Devuelve los datos ingresados a la pantalla de Inicio al pulsar "Enviar" (sin crear una nueva instancia de Inicio, sino cerrando la actual).

### 4. Sobre Nosotros
* Pantalla informativa estática sobre el equipo de desarrollo.

### 5. Localización
* Pantalla con información de ubicación simulada y un placeholder visual para un mapa.

---

## 🛠 Tecnologías y Conceptos Aplicados

* **Lenguaje:** Kotlin
* **UI Toolkit:** XML Layouts
* **View Binding:** Se utiliza `Binding.inflate` en lugar de `findViewById` para una gestión de vistas más segura y eficiente.
* **Navegación:** `Intent` explícito.
* **Paso de Datos (Ida):** `intent.putExtra`.
* **Paso de Datos (Vuelta):** `registerForActivityResult` (sustituyendo al obsoleto `startActivityForResult`).

---

## 📸 Estructura del Proyecto

```text
com.example.miprimeraaplicacion
├── LoginActivity.kt        // Punto de entrada
├── InicioActivity.kt       // Hub central
├── ContactoActivity.kt     // Formulario con retorno de datos
├── SobreNosotrosActivity.kt
└── LocalizacionActivity.kt
