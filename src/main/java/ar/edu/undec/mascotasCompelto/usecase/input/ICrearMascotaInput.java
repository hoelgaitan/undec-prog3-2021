package ar.edu.undec.mascotasCompelto.usecase.input;

import ar.edu.undec.mascotasCompelto.domain.Mascota;
import ar.edu.undec.mascotasCompelto.exceptions.MascotaExisteException;

public interface ICrearMascotaInput {
    boolean crearMascota(Mascota nombreMscota) throws MascotaExisteException;
}
