package com.neoofcomstudio.godot3_5_3_demo_plugin;

import android.util.Log;

import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

import com.neoofcomstudio.godot3_5_3_demo_plugin.utils.annotation.GodotMethod;

import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;
import org.godotengine.godot.plugin.SignalInfo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DemoPlugin extends GodotPlugin {

    private Set<SignalInfo> signals = new HashSet<>();


    public DemoPlugin(Godot godot) {
        super(godot);
        initSignals();
    }


    // inicializa las señales que queremos definir en el motor de Godot
    // para este plugin. Añade las señales que quieres que sean accesibles.
    @DoNotInline
    private void initSignals() {
        signals.add(
                new SignalInfo("testSignal", String.class));
        // nuevas señales aquí.
    }

    // Devuelve el nombre de la clase como nombre del Singleton a usar en el motor de Godot
    @NonNull
    @Override
    public String getPluginName() {
        return this.getClass().getSimpleName();
    }

    // Devuelve la lista de métodos al motor de Godot
    // Busca los métodos con la etiqueta GododMethod y los notifica al motor de Godot
    @NonNull
    @Override
    public List<String> getPluginMethods() {
        Method[] methods = this.getClass().getDeclaredMethods(); // obtiene los métodos publicos de esta clase
        List<String> list = new ArrayList<>(); // inicializa la lista que almacenará los métodos a devolver
        for (Method method : methods) {
            if (!method.isAnnotationPresent(GodotMethod.class))
                continue; // Si el método no está marcado como método de godot pasa al siguiente
            Log.i("--->", "getPluginMethods: " + method.getName());
            list.add(method.getName()); // añade a la lista el método con la anotación GodotMethod
        }
        return list;
    }

    // Devuelve las señales al motor de Godot
    @NonNull
    @Override
    public Set<SignalInfo> getPluginSignals() {
        return signals;
    }


    //---------------------------------------------------------------------------------------------------//
    //                         Inicio de los métodos personalizados                                      //
    // Los métodos generales exportables a Godot han de ser públicos y contener la etiqueta GodotMethod  //
    //---------------------------------------------------------------------------------------------------//


    @GodotMethod
    public String getHello() {
        return "ola q ase?. Plugins para godot o q ase?";
    }


    @GodotMethod
    public void getHelloSignal(String s) {
        emitSignal("testSignal", s);
    }

}
