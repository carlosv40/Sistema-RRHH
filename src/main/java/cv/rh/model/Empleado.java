package cv.rh.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Empleado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmpleado;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String departamento;

    @Column(nullable = false)
    private Double sueldo;
}
