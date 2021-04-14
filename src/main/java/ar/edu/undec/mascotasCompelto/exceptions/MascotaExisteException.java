package ar.edu.undec.mascotasCompelto.exceptions;

public class MascotaExisteException extends Exception{

    @Override
    public String getMessage() {
        return "Ya existe una mascota con ese nombre";
    }
}
