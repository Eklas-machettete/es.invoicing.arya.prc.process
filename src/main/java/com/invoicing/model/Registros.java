package com.invoicing.model;

public class Registros {

	private String fecha;
	private String fecha_cont;
	private String fecha_decl;
	private String ref;
	private String nif;
	private String consta;
	private String acreedor;
	private String nombre;
	private String importe;
	private String importe_iva;
	private String importe_brut;
	private String tipo;
	private String tipo_cod;
	private String descripcion;
	private String pais;
	private String pais_sigla;
	private String documento;
	private String lf;
	private int mes;
	public Registros (String fecha, String nif, String nombre, String importe, String tipo, String pais, String documento, int mes) {
		setFecha(fecha);
		setNif(nif);
		setNombre(nombre);
		setImporte(importe);
		setTipo(tipo);
		setPais(pais);
		setDocumento(documento);
		setMes(mes);
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getImporte() {
		return importe;
	}
	public void setImporte(String importe) {
		this.importe = importe;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String toString() {
		return fecha+":"+nif+":"+nombre+":"+importe+":"+tipo+":"+pais+":"+documento+":"+mes;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public String getFecha_cont() {
		return fecha_cont;
	}
	public void setFecha_cont(String fecha_cont) {
		this.fecha_cont = fecha_cont;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getFecha_decl() {
		return fecha_decl;
	}
	public void setFecha_decl(String fecha_decl) {
		this.fecha_decl = fecha_decl;
	}
	public String getConsta() {
		return consta;
	}
	public void setConsta(String consta) {
		this.consta = consta;
	}
	public String getAcreedor() {
		return acreedor;
	}
	public void setAcreedor(String acreedor) {
		this.acreedor = acreedor;
	}
	public String getImporte_iva() {
		return importe_iva;
	}
	public void setImporte_iva(String importe_iva) {
		this.importe_iva = importe_iva;
	}
	public String getImporte_brut() {
		return importe_brut;
	}
	public void setImporte_brut(String importe_brut) {
		this.importe_brut = importe_brut;
	}
	public String getTipo_cod() {
		return tipo_cod;
	}
	public void setTipo_cod(String tipo_cod) {
		this.tipo_cod = tipo_cod;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPais_sigla() {
		return pais_sigla;
	}
	public void setPais_sigla(String pais_sigla) {
		this.pais_sigla = pais_sigla;
	}
	public String getLf() {
		return lf;
	}
	public void setLf(String lf) {
		this.lf = lf;
	}
}
