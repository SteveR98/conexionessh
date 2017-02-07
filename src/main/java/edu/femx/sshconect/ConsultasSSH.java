package edu.femx.sshconect;



	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;
	
	public class ConsultasSSH {
		
		
		public static final String CONSULTA_SINTOMAS_POR_PATOLOGIA = "SELECT * FROM Sintomas WHERE id_sint IN (SELECT id_sint FROM Causas WHERE id_patol = ";
		public static final String CONSULTA_LISTAR_PATOLOGIAS = "SELECT * FROM Patologias";
		public static final String CONSULTA_LISTAR_SINTOMAS = "SELECT * FROM Sintomas";
		
		
		public static List<SintomasDTO> buscarSintomasPorPatologia (Statement stmt, Connection conn, int id_patologia) throws SQLException
		{
			List<SintomasDTO> patologiaList = new ArrayList<SintomasDTO>();
			
				String descripcion_sintoma = null;
				int id_sintoma = 0;
				SintomasDTO sintoma = null;
				ResultSet rset = null;
				rset = stmt.executeQuery(ConsultasSSH.CONSULTA_SINTOMAS_POR_PATOLOGIA+id_patologia+")");
				while (rset.next())
			    {
					id_sintoma = rset.getInt(1);
					descripcion_sintoma = rset.getString(2);
					sintoma = new SintomasDTO(id_sintoma, descripcion_sintoma);
					patologiaList.add(sintoma);
				}
				
			return patologiaList;
		}
		
		public static List<PatologiasDTO> listarPatologias (Statement stmt, Connection conn) throws SQLException
		{
			List<PatologiasDTO> lista_patologias = new ArrayList<PatologiasDTO>();
				
				PatologiasDTO patologia = null;
				
				ResultSet rset = null;
				rset = stmt.executeQuery(ConsultasSSH.CONSULTA_LISTAR_PATOLOGIAS);
				while (rset.next())
			    {
					patologia = new PatologiasDTO(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getString(5));
					lista_patologias.add(patologia);
			    }
				
			return lista_patologias;
		}
		
		public static List<SintomasDTO> listarSintomas (Statement stmt, Connection conn) throws SQLException
		{
			List<SintomasDTO> lista_sintomas = new ArrayList<SintomasDTO>();
				
			SintomasDTO sintoma = null;
				
				ResultSet rset = null;
				rset = stmt.executeQuery(ConsultasSSH.CONSULTA_LISTAR_SINTOMAS);
				while (rset.next())
			    {
					sintoma = new SintomasDTO(rset.getInt(1), rset.getString(2));
					lista_sintomas.add(sintoma);
			    }
				
			return lista_sintomas;
		}
		
		
	}