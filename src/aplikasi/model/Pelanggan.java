package aplikasi.model;
// Generated Jan 6, 2017 1:53:27 AM by Hibernate Tools 5.2.0.CR1

/**
 * Pelanggan generated by hbm2java
 */
public class Pelanggan implements java.io.Serializable {

	private Integer id;
	private Kendaraan kendaraanByTahunProduksi;
	private Kendaraan kendaraanByMerkMobil;
	private Kendaraan kendaraanByJenisMobil;
	private Kendaraan kendaraanByTipeMobil;
	private Integer idPelanggan;
	private String nama;
	private String umur;
	private String noKtp;
	private String jenisKelamin;
	private String alamat;
	private String noTlp;
	private String kota;
	private String email;

	public Pelanggan() {
	}

	public Pelanggan(Kendaraan kendaraanByTahunProduksi, Kendaraan kendaraanByMerkMobil,
			Kendaraan kendaraanByJenisMobil, Kendaraan kendaraanByTipeMobil, Integer idPelanggan, String nama,
			String umur, String noKtp, String jenisKelamin, String alamat, String noTlp, String kota, String email) {
		this.kendaraanByTahunProduksi = kendaraanByTahunProduksi;
		this.kendaraanByMerkMobil = kendaraanByMerkMobil;
		this.kendaraanByJenisMobil = kendaraanByJenisMobil;
		this.kendaraanByTipeMobil = kendaraanByTipeMobil;
		this.idPelanggan = idPelanggan;
		this.nama = nama;
		this.umur = umur;
		this.noKtp = noKtp;
		this.jenisKelamin = jenisKelamin;
		this.alamat = alamat;
		this.noTlp = noTlp;
		this.kota = kota;
		this.email = email;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Kendaraan getKendaraanByTahunProduksi() {
		return this.kendaraanByTahunProduksi;
	}

	public void setKendaraanByTahunProduksi(Kendaraan kendaraanByTahunProduksi) {
		this.kendaraanByTahunProduksi = kendaraanByTahunProduksi;
	}

	public Kendaraan getKendaraanByMerkMobil() {
		return this.kendaraanByMerkMobil;
	}

	public void setKendaraanByMerkMobil(Kendaraan kendaraanByMerkMobil) {
		this.kendaraanByMerkMobil = kendaraanByMerkMobil;
	}

	public Kendaraan getKendaraanByJenisMobil() {
		return this.kendaraanByJenisMobil;
	}

	public void setKendaraanByJenisMobil(Kendaraan kendaraanByJenisMobil) {
		this.kendaraanByJenisMobil = kendaraanByJenisMobil;
	}

	public Kendaraan getKendaraanByTipeMobil() {
		return this.kendaraanByTipeMobil;
	}

	public void setKendaraanByTipeMobil(Kendaraan kendaraanByTipeMobil) {
		this.kendaraanByTipeMobil = kendaraanByTipeMobil;
	}

	public Integer getIdPelanggan() {
		return this.idPelanggan;
	}

	public void setIdPelanggan(Integer idPelanggan) {
		this.idPelanggan = idPelanggan;
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

	public String getNoKtp() {
		return this.noKtp;
	}

	public void setNoKtp(String noKtp) {
		this.noKtp = noKtp;
	}

	public String getJenisKelamin() {
		return this.jenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	public String getAlamat() {
		return this.alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getNoTlp() {
		return this.noTlp;
	}

	public void setNoTlp(String noTlp) {
		this.noTlp = noTlp;
	}

	public String getKota() {
		return this.kota;
	}

	public void setKota(String kota) {
		this.kota = kota;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
