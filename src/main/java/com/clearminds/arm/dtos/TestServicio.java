package com.clearminds.arm.dtos;

import java.sql.SQLException;

import com.clearminds.arm.excepciones.BDDException;
import com.clearminds.arm.servicios.ServicioEstudiante;

public class TestServicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {
			srvEstudiante.insertarEstudiante(new Estudiante("Juan","Perez"));
		} catch (BDDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
