package modelo.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class ReservaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long idPersona;
    private Long idHotel;
    private Date fecha;

    // Constructores
    public ReservaDTO() {
    }

    public ReservaDTO(Long idPersona, Long idHotel, Date fecha) {
        this.idPersona = idPersona;
        this.idHotel = idHotel;
        this.fecha = fecha;
    }

    // Getters y Setters
    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public Long getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Long idHotel) {
        this.idHotel = idHotel;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservaDTO reserva = (ReservaDTO) o;
        return Objects.equals(idPersona, reserva.idPersona) && Objects.equals(idHotel, reserva.idHotel) && Objects.equals(fecha, reserva.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPersona, idHotel, fecha);
    }

    // toString
    @Override
    public String toString() {
        return "Reserva{" +
                "idPersona=" + idPersona +
                ", idHotel=" + idHotel +
                ", fecha=" + fecha +
                '}';
    }
}

