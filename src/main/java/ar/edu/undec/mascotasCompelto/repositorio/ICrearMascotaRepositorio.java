package ar.edu.undec.mascotasCompelto.repositorio;

import ar.edu.undec.mascotasCompelto.domain.Mascota;
import javafx.beans.value.ObservableBooleanValue;


public interface ICrearMascotaRepositorio {
    boolean existe(String nombreMascota);

    boolean guardarMascota(Mascota laMascota);
}
