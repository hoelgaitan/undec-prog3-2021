package ar.edu.undec.mascotasCompelto.persistencia.entity;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.time.LocalDate;

//Esta clase representa una entidad que se va a mapear a base de dato

@Entity(name = "mascotas")// notacion entity
@SequenceGenerator(name = "mascotas_id_seq", initialValue = 1, sequenceName = "mascotas_id_seq", allocationSize = 1)
public class MascotaEntity {//clase que mapea con JPA, tiene que tener 4 condiciones: notacion entity, clave primaria, constructor vacio, getter y setter.

    @Id
    @Column(name = "idmascota") //recomendacion, si se usa posgre poner todo en minuscula
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mascotas_id_seq")
    private Integer idMascota; //clave primaria

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "raza")
    private String raza;
    @Column(name = "fechanacimiento")
    private LocalDate fechaNacimiento;


    public MascotaEntity(   ) {//3er condicion: constructor vacio.

    }

    public Integer getIdMascota() { //4to: getter y setter de todos los atributos.
        return idMascota;
    }

    public void setIdMascota(Integer idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
