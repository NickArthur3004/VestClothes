package br.com.vestclothes.models;

public enum PerfilTipo {
	ADMIN(1, "ADMIN"), MEDICO(2, "MEDICO"), PACIENTE(3, "PACIENTE");
	
	private long id;
	private String desc;

	private PerfilTipo(long id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public long getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}
}
