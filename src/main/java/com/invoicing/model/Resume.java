package com.invoicing.model;

import java.util.ArrayList;

public class Resume {
    private String nombre_archivo;
	private Files rfiles;
	private int tregs;
	private int asiento;
	private ArrayList<String> resultados;
	private ArrayList<String> asiento_ins;
	private int fecha;
	private ArrayList<String> fecha_ins;
	private int concepto;
	private ArrayList<String> concepto_ins;
	private int documento;
	private ArrayList<String> documento_ins;
	private int comentario;
	private ArrayList<String> comentario_ins;
	private int cuenta;
	private ArrayList<String> cuenta_ins;
	private int cuenta_hab;
	private int cuenta_ic;
	private ArrayList<String> cuenta_ic_ins;
	private int nombre;
	private ArrayList<String> nombre_ins;
	private int debe;
	private Double tdebe;
	private ArrayList<String> debe_ins;
    private int haber;
	private Double thaber;
	private ArrayList<String> haber_ins;
	private ArrayList<String> columnas;
    private String nombre_cliente;
    private String encode;
	public int getAsiento() {
		return asiento;
	}
	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public int getConcepto() {
		return concepto;
	}
	public void setConcepto(int concepto) {
		this.concepto = concepto;
	}
	public int getComentario() {
		return comentario;
	}
	public void setComentario(int comentario) {
		this.comentario = comentario;
	}
	public int getCuenta() {
		return cuenta;
	}
	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}
	public int getCuenta_ic() {
		return cuenta_ic;
	}
	public void setCuenta_ic(int cuenta_ic) {
		this.cuenta_ic = cuenta_ic;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	public int getDebe() {
		return debe;
	}
	public void setDebe(int debe) {
		this.debe = debe;
	}
	public int getHaber() {
		return haber;
	}
	public void setHaber(int haber) {
		this.haber = haber;
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public ArrayList getAsiento_ins() {
		return asiento_ins;
	}
	public void setAsiento_ins(ArrayList asiento_ins) {
		this.asiento_ins = asiento_ins;
	}
	public ArrayList<String> getFecha_ins() {
		return fecha_ins;
	}
	public void setFecha_ins(ArrayList<String> fecha_ins) {
		this.fecha_ins = fecha_ins;
	}
	public ArrayList<String> getConcepto_ins() {
		return concepto_ins;
	}
	public void setConcepto_ins(ArrayList<String> concepto_ins) {
		this.concepto_ins = concepto_ins;
	}
	public ArrayList<String> getDocumento_ins() {
		return documento_ins;
	}
	public void setDocumento_ins(ArrayList<String> documento_ins) {
		this.documento_ins = documento_ins;
	}
	public ArrayList<String> getComentario_ins() {
		return comentario_ins;
	}
	public void setComentario_ins(ArrayList<String> comentario_ins) {
		this.comentario_ins = comentario_ins;
	}
	public ArrayList<String> getCuenta_ins() {
		return cuenta_ins;
	}
	public void setCuenta_ins(ArrayList<String> cuenta_ins) {
		this.cuenta_ins = cuenta_ins;
	}
	public ArrayList<String> getCuenta_ic_ins() {
		return cuenta_ic_ins;
	}
	public void setCuenta_ic_ins(ArrayList<String> cuenta_ic_ins) {
		this.cuenta_ic_ins = cuenta_ic_ins;
	}
	public ArrayList<String> getNombre_ins() {
		return nombre_ins;
	}
	public void setNombre_ins(ArrayList<String> nombre_ins) {
		this.nombre_ins = nombre_ins;
	}
	public ArrayList<String> getDebe_ins() {
		return debe_ins;
	}
	public void setDebe_ins(ArrayList<String> debe_ins) {
		this.debe_ins = debe_ins;
	}
	public ArrayList<String> getHaber_ins() {
		return haber_ins;
	}
	public void setHaber_ins(ArrayList<String> haber_ins) {
		this.haber_ins = haber_ins;
	}
	public ArrayList<String> getColumnas() {
		return columnas;
	}
	public void setColumnas(ArrayList<String> columnas) {
		this.columnas = columnas;
	}
	public int getCuenta_hab() {
		return cuenta_hab;
	}
	public void setCuenta_hab(int cuenta_hab) {
		this.cuenta_hab = cuenta_hab;
	}
	public Double getTdebe() {
		return tdebe;
	}
	public void setTdebe(Double tdebe) {
		this.tdebe = tdebe;
	}
	public Double getThaber() {
		return thaber;
	}
	public void setThaber(Double thaber) {
		this.thaber = thaber;
	}
	public int getTregs() {
		return tregs;
	}
	public void setTregs(int tregs) {
		this.tregs = tregs;
	}
	public ArrayList<String> getResultados() {
		return resultados;
	}
	public void setResultados(ArrayList<String> resultados) {
		this.resultados = resultados;
	}
	public Files getRfiles() {
		return rfiles;
	}
	public void setRfiles(Files rfiles) {
		this.rfiles = rfiles;
	}
	public String getEncode() {
		return encode;
	}
	public void setEncode(String encode) {
		this.encode = encode;
	}
	public String getNombre_archivo() {
		return nombre_archivo;
	}
	public void setNombre_archivo(String nombre_archivo) {
		this.nombre_archivo = nombre_archivo;
	}
}
