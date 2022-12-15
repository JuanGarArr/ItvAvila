package com.iesam.JuanGarcia.ITV.data;

import com.iesam.JuanGarcia.ITV.domain.models.Propietario;

import java.util.Map;
import java.util.TreeMap;

public class PropietarioDataStore {


        private static com.iesam.JuanGarcia.ITV.data.PropietarioDataStore instance = null;

        private Map<String, Propietario> dataStore = new TreeMap<>();

        public void guardar(Propietario propietario) {
            dataStore.put(String.valueOf(propietario.getClass()), propietario);
        }

        public void eliminar(String dni) {
            dataStore.remove(dni);
        }

        public Propietario buscar(String Matricula) {
            return dataStore.get(Matricula);
        }

        public void modificar(Propietario propietario) {
            dataStore.put(String.valueOf(propietario.getClass()), propietario);
        }

        public static com.iesam.JuanGarcia.ITV.data.PropietarioDataStore getInstance() {
            if (instance == null) {
                instance = new com.iesam.JuanGarcia.ITV.data.PropietarioDataStore();
            }
            return instance;
        }
    }

