package com.iesam.JuanGarcia.ITV.domain.usecase.InspeccionUseCase;

import com.iesam.JuanGarcia.ITV.data.InspeccionDataStore;

public class DeleteInspeccionUseCase {

    private InspeccionDataStore dataStore = InspeccionDataStore.getInstance().getInstance();

    public void execute(Integer codigo) {
        dataStore.eliminar(codigo);
    }
}

