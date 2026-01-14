# Práctica 3.2: Componente ModernSwitch

Repositorio para la asignatura de Desarrollo de Interfaces.
El proyecto consiste en una librería de JavaFX que implementa un componente personalizado: un interruptor (switch) con animación.

## Descripción
He creado un componente llamado `ModernSwitch` que funciona como un botón de encendido/apagado.
Incluye:
- **Propiedad:** `switchedOn` para controlar el estado.
- **Evento:** Reacciona a los clics del ratón.
- **Animación:** Desplazamiento y cambio de color al activarse.

## Herramientas utilizadas
El listado completo está en el archivo `tools.md`, pero principalmente he usado:
- Java 21 y JavaFX
- IntelliJ IDEA
- Gradle (Kotlin DSL)
- JUnit 5 y TestFX para las pruebas

## Documentación
He generado una página web con la documentación del componente usando GitHub Pages.
Puedes consultarla aquí:
-> **[Ver Documentación del Componente](https://zetaits.github.io/modern-switch-library/)**

## Instalación y Prueba
Para generar el `.jar` de la librería e instalarlo en local (Maven Local), ejecuta este comando en la terminal:

```bash
./gradlew publishToMavenLocal
