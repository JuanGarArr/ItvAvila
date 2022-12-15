package com.iesam.JuanGarcia.ITV.presentation;

import com.iesam.JuanGarcia.ITV.data.InspeccionDataStore;
import com.iesam.JuanGarcia.ITV.domain.models.Camion;
import com.iesam.JuanGarcia.ITV.domain.models.Coche;
import com.iesam.JuanGarcia.ITV.domain.models.Inspeccion;
import com.iesam.JuanGarcia.ITV.domain.models.Propietario;

import com.iesam.JuanGarcia.ITV.domain.usecase.InspeccionUseCase.DeleteInspeccionUseCase;
import com.iesam.JuanGarcia.ITV.domain.usecase.InspeccionUseCase.AddInspeccionUseCase;
import com.iesam.JuanGarcia.ITV.domain.usecase.InspeccionUseCase.UpdateInspeccionUseCase;


public class Main {

            public static void main() {



                //Propietario
                Propietario propietario = new Propietario();
                propietario.setNombre("juan");
                propietario.setApellidos("lopez");

                //ve



                //Inspeccion1
                Inspeccion inspeccion = new Inspeccion();

                inspeccion.setCodInspecion("1");
                inspeccion.setDateInspeccion("15/11/2022");
                inspeccion.setResultado("true");
                inspeccion.setDniCliente("1");

                //Inspeccion2
                Inspeccion inspeccion2 = new Inspeccion();

                inspeccion2.setCodInspecion("2");
                inspeccion2.setDateInspeccion("15/11/2022");
                inspeccion2.setResultado("false");
                inspeccion2.setDniCliente("1");





                //-- 1. Guardo Inspeccion
                AddInspeccionUseCase addInspeccionUseCase = new AddInspeccionUseCase();
                addInspeccionUseCase.execute(inspeccion);



                /*//-- 2. Recupero un  modelo
                Busca buscarDemoUseCase = new BuscarDemoUseCase();
                Demo demoBuscado = buscarDemoUseCase.execute("1"); //Pongo el código del Demo que quiero recuperar
                System.out.println("Demo buscado" + demoBuscado.getCodigo() + " | " + demoBuscado.getNombre());

                //-- 3. Modifico un modelo buscado (reutilizo la creación del caso de uso "Buscar" anterior)
                Demo demoAModificar = buscarDemoUseCase.execute("1");
                demoAModificar.setNombre("NombreModificado");
                //Guardo el modelo para salvar las modificaciones (reutilizo el caso de uso guardado)
                guardarDemoUseCase.execute(demoAModificar);

                //-- 4. Elimino un modelo
                EliminarDemoUseCase eliminarDemoUseCase = new EliminarDemoUseCase();
                eliminarDemoUseCase.execute("1"); //Elimino el modelo con código 1.
                /**
                 */

            }

    }
