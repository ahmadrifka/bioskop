package com.enigmacamp.bioskop.entities;

import java.util.Date;

public class Transaksi {

	private Integer id;
	private Integer jumlah;
	private Integer total;
	private Date tanggal;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getJumlah() {
		return jumlah;
	}
	public void setJumlah(Integer jumlah) {
		this.jumlah = jumlah;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Date getTanggal() {
		return tanggal;
	}
	public void setTanggal(Date tanggal) {
		this.tanggal = tanggal;
	}
	
}
