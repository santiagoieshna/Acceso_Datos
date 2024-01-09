package modelo.Entity;

import java.io.Serializable;

import java.io.Serializable;
import java.util.Objects;

public class HotelDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private String nombre;

    // Constructores
    public HotelDTO() {
    }

    public HotelDTO(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelDTO hotel = (HotelDTO) o;
        return id == hotel.id && Objects.equals(nombre, hotel.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }

    // toString
    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}


