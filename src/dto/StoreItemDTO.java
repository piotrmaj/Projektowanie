package dto;

public class StoreItemDTO {
	private int id;
	private int idProduktu;
	private String nazwa;
	private int iloscCalkowita;
	private int iloscDostepna;
	private String jednostka;
	private float cena;
	private String opis;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdProduktu() {
		return idProduktu;
	}
	public void setIdProduktu(int idProduktu) {
		this.idProduktu = idProduktu;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public int getIloscCalkowita() {
		return iloscCalkowita;
	}
	public void setIloscCalkowita(int iloscCalkowita) {
		this.iloscCalkowita = iloscCalkowita;
	}
	public int getIloscDostepna() {
		return iloscDostepna;
	}
	public void setIloscDostepna(int iloscDostepna) {
		this.iloscDostepna = iloscDostepna;
	}
	public String getJednostka() {
		return jednostka;
	}
	public void setJednostka(String jednostka) {
		this.jednostka = jednostka;
	}
	public float getCena() {
		return cena;
	}
	public void setCena(float cena) {
		this.cena = cena;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
}
