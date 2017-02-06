package edu.femx.sshconect;

public class ConsultasSSH {
	
	
	public static final String BUSCAR_SINTOMAS_NOMBRE
	= "SELECT * des_sint From Sintomas Where id_sint IN"
	+ " (Select id_sint From Sintomas Where id_sint)";

	public static final String LISTAR_PATOLGIAS_SINTOMA
	= "SELECT * nom_patol FROM Patologias WHERE id_patol IN "
	+ "(SELECT id_patol FROM Causas WHERE id_sint = 3)";

}
