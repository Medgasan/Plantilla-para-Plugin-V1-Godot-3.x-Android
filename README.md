# Plantilla para Plugin V1 Godot 3.x Android

## Plantilla preconfigurada para crear plugins android
### Mejoras:
* Para definir los métodos exportables sólo has de ser publicos y contener la etiqueta @GodotMethod
* Con esto, la plantilla se encarga de recopilar esos métodos y exponerlos al Motor.
* De momento, las señales se siguen definiendo en `initSignals()`
* El plugin expone el nombre de la clase como nombre del plugin en `getPluginName()`.


## Modificaciones:

### Importante, antes de empezar:
* No actualizar la librería "androidx.appcompat:appcompat:1.5.0"
* Para ver todos los elementos es aconsejable usar la vista de _"Project"_  en el árbol de carpetas
* La plantilla ya incluye la librería godot-lib.3.5.3.stable.release.aar en la carpeta app/libs

### Renombrar (May+F6 -> Rename):

2. [ ] Crear un nuevo nombre de paquete.
3. [ ] Mover el contenido de '_com.neoofcomstudio.Godot3_5_3_DemoPlugin_' al nuevo espacio de nombres.
4. [ ] En caso de ser necesario, corregir el package en la clase y en la anotación
5. [ ] Renombrar nombre de la Clase Principal (DemoPlugin)

### Editar 

#### AndroidManifest.xml
1. [ ] Modificar 'android:name="org.godotengine.plugin.v1.[nombre del plugin]"'
2. [ ] Modificar: 'android:value="[nombre del paquete].[nombre de la clase]"'
#### build.gradle.kts  (:app)
1. [ ] Modificar 'namespace = "[nombre del paquete]"'

#### settings.gradle.kts
1. [ ] rootProject.name = "[nombre del proyecto]"

### Si fuera necesario, actualizar: libs/_godot-lib.3.5.3.stable.release.aar_ desde:

* https://godotengine.org/download/3.x/windows/

------------------------------------------------------------------------------------------
# Template for Plugin V1 Godot 3.x Android

### Preconfigured Template for Creating Android Plugins
### Improvements:
* To define exportable methods, they only need to be public and contain the @GodotMethod annotation.
* The template automatically collects these methods and exposes them to the Engine.
* For now, signals are still defined in the `initSignals()` method.
* The plugin exposes the class name as the plugin name in `getPluginName()`.

## Modifications:
### Important, before starting:
* Do not update the library "androidx.appcompat:appcompat:1.5.0"
* To see all the elements, it is recommended to use the "Project" view in the folder tree.
* The template already includes the godot-lib.3.5.3.stable.release.aar library in the app/libs folder.
### Rename (Shift+F6 -> Rename):
1. [ ] Create a new package name.
2. [ ] Move the content from 'com.neoofcomstudio.Godot3_5_3_DemoPlugin' to the new namespace.
3. [ ] If necessary, correct the package in the class and in the annotation.
4. [ ] Rename the Main Class (DemoPlugin).
### Edit
#### AndroidManifest.xml
1. [ ] Modify 'android="org.godotengine.plugin.v1.[plugin name]"'
2. [ ] Modify: 'android="[package name].[class name]"'
#### build.gradle.kts (:app)
1. [ ] Modify 'namespace = "[package name]"'
#### settings.gradle.kts
1. [ ] rootProject.name = "[project name]"
### If necessary, update: libs/godot-lib.3.5.3.stable.release.aar from:
* https://godotengine.org/download/3.x/windows/
