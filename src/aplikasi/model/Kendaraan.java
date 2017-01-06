package aplikasi.model;
// Generated Jan 6, 2017 1:53:27 AM by Hibernate Tools 5.2.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Kendaraan generated by hbm2java
 */
public class Kendaraan implements java.io.Serializable {

	private Integer id;
	private Integer idMobil;
	private String merk;
	private String tipe;
	private String jenis;
	private String warna;
	private String tahun;
	private String noPolisi;
	private String harga;
	private String status;
	private Set pelanggansForTahunProduksi = new HashSet(0);
	private Set pelanggansForMerkMobil = new HashSet(0);
	private Set pelanggansForJenisMobil = new HashSet(0);
	private Set pelanggansForTipeMobil = new HashSet(0);

	public Kendaraan() {
	}

	public Kendaraan(Integer idMobil, String merk, String tipe, String jenis, String warna, String tahun,
			String noPolisi, String harga, String status, Set pelanggansForTahunProduksi, Set pelanggansForMerkMobil,
			Set pelanggansForJenisMobil, Set pelanggansForTipeMobil) {
		this.idMobil = idMobil;
		this.merk = merk;
		this.tipe = tipe;
		this.jenis = jenis;
		this.warna = warna;
		this.tahun = tahun;
		this.noPolisi = noPolisi;
		this.harga = harga;
		this.status = status;
		this.pelanggansForTahunProduksi = pelanggansForTahunProduksi;
		this.pelanggansForMerkMobil = pelanggansForMerkMobil;
		this.pelanggansForJenisMobil = pelanggansForJenisMobil;
		this.pelanggansForTipeMobil = pelanggansForTipeMobil;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdMobil() {
		return this.idMobil;
	}

	public void setIdMobil(Integer idMobil) {
		this.idMobil = idMobil;
	}

	public String getMerk() {
		return this.merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public String getTipe() {
		return this.tipe;
	}

	public void setTipe(String tipe) {
		this.tipe = tipe;
	}

	public String getJenis() {
		return this.jenis;
	}

	public void setJenis(String jenis) {
		this.jenis = jenis;
	}

	public String getWarna() {
		return this.warna;
	}

	public void setWarna(String warna) {
		this.warna = warna;
	}

	public String getTahun() {
		return this.tahun;
	}

	public void setTahun(String tahun) {
		this.tahun = tahun;
	}

	public String getNoPolisi() {
		return this.noPolisi;
	}

	public void setNoPolisi(String noPolisi) {
		this.noPolisi = noPolisi;
	}

	public String getHarga() {
		return this.harga;
	}

	public void setHarga(String harga) {
		this.harga = harga;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set getPelanggansForTahunProduksi() {
		return this.pelanggansForTahunProduksi;
	}

	public void setPelanggansForTahunProduksi(Set pelanggansForTahunProduksi) {
		this.pelanggansForTahunProduksi = pelanggansForTahunProduksi;
	}

	public Set getPelanggansForMerkMobil() {
		return this.pelanggansForMerkMobil;
	}

	public void setPelanggansForMerkMobil(Set pelanggansForMerkMobil) {
		this.pelanggansForMerkMobil = pelanggansForMerkMobil;
	}

	public Set getPelanggansForJenisMobil() {
		return this.pelanggansForJenisMobil;
	}

	public void setPelanggansForJenisMobil(Set pelanggansForJenisMobil) {
		this.pelanggansForJenisMobil = pelanggansForJenisMobil;
	}

	public Set getPelanggansForTipeMobil() {
		return this.pelanggansForTipeMobil;
	}

	public void setPelanggansForTipeMobil(Set pelanggansForTipeMobil) {
		this.pelanggansForTipeMobil = pelanggansForTipeMobil;
	}

}
