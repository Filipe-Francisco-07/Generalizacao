package com.filipe.nave;

public class MillenniumFalcon extends Apollo11 {

	private float classeHiperpropulsor;

	public MillenniumFalcon(double velocidadeMaxima) {
		super(velocidadeMaxima);
		setClasseHiperpropulsor(classeHiperpropulsor);
	}

	public float getClasseHiperpropulsor() {
		return classeHiperpropulsor;
	}

	public void setClasseHiperpropulsor(float classeHiperpropulsor) {
		this.classeHiperpropulsor = classeHiperpropulsor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("MillenniumFalcon [classeHiperpropulsor=");
		builder.append(classeHiperpropulsor);
		builder.append("]");
		return builder.toString();
	}

}