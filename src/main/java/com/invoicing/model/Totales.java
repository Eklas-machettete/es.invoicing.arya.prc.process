package com.invoicing.model;

import java.util.HashMap;

public class Totales {

	private HashMap<String, String> totales;
	private HashMap<String, String> totales_iva;
	private HashMap<String, String> operaciones;
	private int total_operaciones;
	public HashMap<String, String> getTotales() {
		return totales;
	}
	public void setTotales(HashMap<String, String> totales) {
		this.totales = totales;
	}
	public HashMap<String, String> getTotales_iva() {
		return totales_iva;
	}
	public void setTotales_iva(HashMap<String, String> totales_iva) {
		this.totales_iva = totales_iva;
	}
	public int getTotal_operaciones() {
		return total_operaciones;
	}
	public void setTotal_operaciones(int total_operaciones) {
		this.total_operaciones = total_operaciones;
	}
	public HashMap<String, String> getOperaciones() {
		return operaciones;
	}
	public void setOperaciones(HashMap<String, String> operaciones) {
		this.operaciones = operaciones;
	}
}
