package edu.femx.sshconect;

public class PatologiasDTO {
	
	private int pato_id;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.pato_id+". "+this.nom_Pato;
	}
	
	
	public PatologiasDTO(int pato_id, String nom_Pato, String descrip_pato, String trata_patologia, String causas) {
		super();
		this.pato_id = pato_id;
		this.nom_Pato = nom_Pato;
		this.descrip_pato = descrip_pato;
		this.trata_patologia = trata_patologia;
		this.causas = causas;
	}
	public int getPato_id() {
		return pato_id;
	}
	public void setPato_id(int pato_id) {
		this.pato_id = pato_id;
	}
	public String getNom_Pato() {
		return nom_Pato;
	}
	public void setNom_Pato(String nom_Pato) {
		this.nom_Pato = nom_Pato;
	}
	public String getDescrip_pato() {
		return descrip_pato;
	}
	public void setDescrip_pato(String descrip_pato) {
		this.descrip_pato = descrip_pato;
	}
	public String getTrata_patologia() {
		return trata_patologia;
	}
	public void setTrata_patologia(String trata_patologia) {
		this.trata_patologia = trata_patologia;
	}
	public String getCausas() {
		return causas;
	}
	public void setCausas(String causas) {
		this.causas = causas;
	}
	private String nom_Pato;
	private String descrip_pato;
	private String trata_patologia;
	private String causas;

	
	
}
