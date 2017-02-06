package conexionssh;

public class Consultas {

	public static final String BUSCAR_SINTOMAS_POR_NOMBRE
	= "SELECT des_sint From Sintomas Where id_sint IN (Select id_sint From Sintomas Where id_sint)";
	
	public static final String BUSCAR_PATOLOGIAS_POR_NOMBRE 
	= "Select nom_patol From Patologias Where id_patol IN (Select id_patol from Patologias Where nom_patol = 'Queratocono')";

	public static final String LISTAR_PATOLOGIAS
	= "SELECT nom_patol From Patologias Where id_patol IN (Select id_patol From Patologias Where id_patol)";
	
	public static final String LISTAR_PATOLGIAS_POR_SINTOMA
	= "SELECT nom_patol FROM Patologias WHERE id_patol IN (SELECT id_patol FROM Causas WHERE id_sint = 3)";
	
	public static final String BUSCAR_SINTOMAS_POR_PATOLOGIA 
	= "SELECT des_sint From Sintomas Where id_sint IN (SELECT id_sint FROM Causas WHERE id_patol IN (SELECT id_patol from Patologias WHERE nom_patol = 'Queratocono'))";
	
	
	
}
