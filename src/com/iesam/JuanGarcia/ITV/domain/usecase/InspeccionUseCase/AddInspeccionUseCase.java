package com.iesam.JuanGarcia.ITV.domain.usecase.InspeccionUseCase;

import com.iesam.JuanGarcia.ITV.data.InspeccionDataStore;
import com.iesam.JuanGarcia.ITV.domain.models.Inspeccion;

public class AddInspeccionUseCase {

    private InspeccionDataStore dataStore = InspeccionDataStore.getInstance().getInstance();

    public Inspeccion execute(Inspeccion codigo) {
        return dataStore.buscar(codigo);
    }
}
