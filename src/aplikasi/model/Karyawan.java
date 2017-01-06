package aplikasi.model;
// Generated Jan 6, 2017 1:53:27 AM by Hibernate Tools 5.2.0.CR1

import java.util.Date;

/**
 * Karyawan generated by hbm2java
 */
public class Karyawan implements java.io.Serializable {

	private Integer id;
	private int nik;
	private String nama;
	private String umur;
	private String alamat;
	private String jenisKelamin;
	private String jabatan;
	private String scopePekerjaan;
	private String pendidikan;
	private String gaji;
	private Date tglMasuk;
	private Date tglKeluar;

	public Karyawan() {
	}

	public Karyawan(int nik, String nama, String umur, String alamat, String jenisKelamin, String jabatan,
			String scopePekerjaan, String pendidikan, String gaji) {
		this.nik = nik;
		this.nama = nama;
		this.umur = umur;
		this.alamat = alamat;
		this.jenisKelamin = jenisKelamin;
		this.jabatan = jabatan;
		this.scopePekerjaan = scopePekerjaan;
		this.pendidikan = pendidikan;
		this.gaji = gaji;
	}

	public Karyawan(int nik, String nama, String umur, String alamat, String jenisKelamin, String jabatan,
			String scopePekerjaan, String pendidikan, String gaji, Date tglMasuk, Date tglKeluar) {
		this.nik = nik;
		this.nama = nama;
		this.umur = umur;
		this.alamat = alamat;
		this.jenisKelamin = jenisKelamin;
		this.jabatan = jabatan;
		this.scopePekerjaan = scopePekerjaan;
		this.pendidikan = pendidikan;
		this.gaji = gaji;
		this.tglMasuk = tglMasuk;
		this.tglKeluar = tglKeluar;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getNik() {
		return this.nik;
	}

	public void setNik(int nik) {
		this.nik = nik;
	}

	public String getNama() {
		return this.nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getUmur() {
		return this.umur;
	}

	public void setUmur(String umur) {
		this.umur = umur;
	}

	public String getAlamat() {
		return this.alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getJenisKelamin() {
		return this.jenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	public String getJabatan() {
		return this.jabatan;
	}

	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}

	public String getScopePekerjaan() {
		return this.scopePekerjaan;
	}

	public void setScopePekerjaan(String scopePekerjaan) {
		this.scopePekerjaan = scopePekerjaan;
	}

	public String getPendidikan() {
		return this.pendidikan;
	}

	public void setPendidikan(String pendidikan) {
		this.pendidikan = pendidikan;
	}

	public String getGaji() {
		return this.gaji;
	}

	public void setGaji(String gaji) {
		this.gaji = gaji;
	}

	public Date getTglMasuk() {
		return this.tglMasuk;
	}

	public void setTglMasuk(Date tglMasuk) {
		this.tglMasuk = tglMasuk;
	}

	public Date getTglKeluar() {
		return this.tglKeluar;
	}

	public void setTglKeluar(Date tglKeluar) {
		this.tglKeluar = tglKeluar;
	}

}
