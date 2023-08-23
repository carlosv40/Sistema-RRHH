package cv.rh.service;

import cv.rh.model.Empleado;

import java.util.List;

public interface IEmpleadoService {

    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleadoPorId(Integer idEmpleado);

    public Empleado guardarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);
}
