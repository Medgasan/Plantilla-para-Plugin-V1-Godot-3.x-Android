# Plantilla para Plugin V1 Godot 3.x Android

## Modificaciones:

### Importante, antes de empezar:
* No actualizar la librería "androidx.appcompat:appcompat:1.5.0"
* Para ver todos los elementos es aconsejable usar la vista de _"Project"_  en el árbol de carpetas

### Renombrar (May+F6 -> Rename):

1. [ ] Nombre del módulo (Godot3_5_3_DemoPlugin)
2. [ ] Crear un nuevo nombre de paquete
3. [ ] mover el contenido de '_com.neoofcomstudio.Godot3_5_3_DemoPlugin_' al nuevo espacio de nombres
4. [ ] Corregir el package en la clase y en la anotación
5. [ ] Nombre de la Clase Principal (DemoPlugin)

### Editar

#### AndroidManifest.xml
1. [ ] Modificar: 'android:value="[nombre del paquete].[nombre de la clase]"'
#### build.gradle.kts  (:app)
1. [ ] Modificar 'namespace = "[nombre del paquete]"'
2. [ ] Modificar 'android:name="org.godotengine.plugin.v1.[nombre del plugin]"'

#### settings.gradle.kts
1. [ ] rootProject.name = "[nombre del proyecto]"

### Si fuera necesario, actualizar: libs/_godot-lib.3.5.3.stable.release.aar_ desde:

* https://godotengine.org/download/3.x/windows/