package com.metricalab.refranes.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "log_refran")
public class LogRefran implements Serializable {

	private static final long serialVersionUID = 873894166276508362L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(nullable = false)
	private String accion;

	@Column(nullable = false)
	private String verbo;

	@Column(name = "fecha")
	private Date fecha;

	@Column(nullable = false)
	private String descripcion;

	public LogRefran() {

	}

	public LogRefran(String accion, String verbo, Date fecha, String descripcion) {
		super();
		this.accion = accion;
		this.verbo = verbo;
		this.fecha = fecha;
		this.descripcion = descripcion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public String getVerbo() {
		return verbo;
	}

	public void setVerbo(String verbo) {
		this.verbo = verbo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
