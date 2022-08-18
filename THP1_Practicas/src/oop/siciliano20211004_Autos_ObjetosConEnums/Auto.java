package oop.siciliano20211004_Autos_ObjetosConEnums;

public class Auto {
	private String modelo;
	private String marca;
	private Color colorAuto;
	
	public Auto(String modelo, String marca, Color colorAuto) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.colorAuto = colorAuto;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Color getColorAuto() {
		return colorAuto;
	}
	public void setColorAuto(Color colorAuto) {
		this.colorAuto = colorAuto;
	}
	@Override
	public String toString() {
		return "Auto [modelo=" + modelo + ", marca=" + marca + ", colorAuto=" + colorAuto + "]";
	};
	
	
}
