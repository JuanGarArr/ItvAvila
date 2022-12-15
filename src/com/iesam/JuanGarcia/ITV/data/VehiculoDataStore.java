package com.iesam.JuanGarcia.ITV.data;

import com.iesam.JuanGarcia.ITV.domain.models.Vehiculo;

import java.util.Map;
import java.util.TreeMap;


    public class VehiculoDataStore {


        private static com.iesam.JuanGarcia.ITV.data.VehiculoDataStore instance = null;

        private Map<String, Vehiculo> dataStore = new TreeMap<>();

        public void guardar(Vehiculo vehiculo) {
            dataStore.put(vehiculo.getMatricula(), vehiculo);
        }

        public void eliminar(String Matricula) {
            dataStore.remove(Matricula);
        }

        public Vehiculo buscar(String Matricula) {
            return dataStore.get(Matricula);
        }

        public void modificar(Vehiculo model) {
            dataStore.put(model.getMatricula(), model);
        }

        public static com.iesam.JuanGarcia.ITV.data.VehiculoDataStore getInstance() {
            if (instance == null) {
                instance = new com.iesam.JuanGarcia.ITV.data.VehiculoDataStore();
            }
            return instance;
        }
    }

