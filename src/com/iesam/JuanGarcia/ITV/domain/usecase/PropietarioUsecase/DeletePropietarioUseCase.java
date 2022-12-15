package com.iesam.JuanGarcia.ITV.domain.usecase.PropietarioUsecase;

import com.iesam.JuanGarcia.ITV.data.PropietarioDataStore;

public class DeletePropietarioUseCase {
    private PropietarioDataStore dataStore = PropietarioDataStore.getInstance();

    public void execute(Integer codigo) {
        dataStore.eliminar(String.valueOf(codigo));
    }
}

