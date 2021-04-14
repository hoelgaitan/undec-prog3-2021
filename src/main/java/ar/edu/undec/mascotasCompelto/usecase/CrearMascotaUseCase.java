package ar.edu.undec.mascotasCompelto.usecase;

import ar.edu.undec.mascotasCompelto.domain.Mascota;
import ar.edu.undec.mascotasCompelto.exceptions.MascotaExisteException;
import ar.edu.undec.mascotasCompelto.repositorio.ICrearMascotaRepositorio;
import ar.edu.undec.mascotasCompelto.usecase.input.ICrearMascotaInput;

public class CrearMascotaUseCase implements ICrearMascotaInput {
    private ICrearMascotaRepositorio crearMascotaRepositorio;

    public CrearMascotaUseCase(ICrearMascotaRepositorio crearMascotaRepositorio) {

        this.crearMascotaRepositorio = crearMascotaRepositorio;
    }


    @Override
    public boolean crearMascota(Mascota laMascota) throws MascotaExisteException {
        if (crearMascotaRepositorio.existe(laMascota.getNombre()))
            throw new MascotaExisteException();

            else{
                crearMascotaRepositorio.guardarMascota(laMascota);
                return true;
            }
        }
    }

