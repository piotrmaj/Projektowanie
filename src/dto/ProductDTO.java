package dto;

public class ProductDTO {
	private int id;
	private String nazwa;
	private String jednostka;
	private String opis;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getJednostka() {
		return jednostka;
	}
	public void setJednostka(String jednostka) {
		this.jednostka = jednostka;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
}
