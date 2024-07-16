# Plantilla para Plugin V1 Godot 3.x Android

## Modificaciones:

### Importante, antes de empezar:
* No actualizar la librería "androidx.appcompat:appcompat:1.5.0"
* Para ver todos los elementos es aconsejable usar la vista de _"Project"_  en el árbol de carpetas

### Renombrar (May+F6 -> Rename):

1. [ ] Nombre del módulo (Godot3_5_3_DemoPlugin)
2. [ ] Nombre del Paquete (com.neoofcomstudio.Godot3_5_3_DemoPlugin)
3. [ ] Nombre de la Clase Principal (DemoPlugin)

### Editar

#### AndroidManifest.xml
1. [ ] Modificar: 'android:value="[nombre del paquete].[nombre de la clase]"'
#### build.gradle.kts  (:app)
1. [ ] Modificar 'namespace = "com.neoofcomstudio.godot3_5_3_demo_plugin"'

### Si fuera necesario, actualizar: libs/_godot-lib.3.5.3.stable.release.aar_ desde:

* https://godotengine.org/download/3.x/windows/