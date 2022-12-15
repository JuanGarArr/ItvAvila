package com.iesam.JuanGarcia.ITV.data;

import com.iesam.JuanGarcia.ITV.domain.models.Inspeccion;

import java.util.Map;
import java.util.TreeMap;

public class InspeccionDataStore {

    private static com.iesam.JuanGarcia.ITV.data.InspeccionDataStore instance = null;

    private Map<String, Inspeccion> dataStore = new TreeMap<>();

    public void guardar(Inspeccion inspeccion) {
        dataStore.put(inspeccion.getCodInspecion(), inspeccion);
    }

    public void eliminar(Integer codInspeccion) {
        dataStore.remove(codInspeccion);
    }

    public Inspeccion buscar(Integer codInspeccion) {
        return dataStore.get(codInspeccion);
    }

    public void modificar(Inspeccion inspeccion) {
        dataStore.put(inspeccion.getCodInspecion(), inspeccion);
    }

    public static InspeccionDataStore getInstance() {
        if (instance == null) {
            instance = new com.iesam.JuanGarcia.ITV.data.InspeccionDataStore();
        }
        return instance;
    }
}
