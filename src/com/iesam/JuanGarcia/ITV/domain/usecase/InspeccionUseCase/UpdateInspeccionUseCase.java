package com.iesam.JuanGarcia.ITV.domain.usecase.InspeccionUseCase;

import com.iesam.JuanGarcia.ITV.data.InspeccionDataStore;
import com.iesam.JuanGarcia.ITV.domain.models.Inspeccion;

public class UpdateInspeccionUseCase {
    private InspeccionDataStore dataStore = InspeccionDataStore.getInstance();

    public void execute(Inspeccion inspeccion) {
        dataStore.modificar(inspeccion);
    }
}
