package com.aurionpro.model;

public class GuitarSpec {

	private Builder builder;
	private String model;
	private Type type;
	private int numStrings;

	public GuitarSpec(Builder builder, String model, Type type, 
			int numStrings, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.numStrings = numStrings;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public int getNumStrings() {
		return numStrings;
	}

	private Wood backWood;
	private Wood topWood;

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public boolean matches(GuitarSpec specs) {
		if (builder != specs.builder)
			return false;
		if ((model != null) && (!model.equals("")) && (!model.toLowerCase().equals(specs.model.toLowerCase())))
			return false;
		if (type != specs.type)
			return false;
		if (numStrings != specs.numStrings)
			return false;
		if (backWood != specs.backWood)
			return false;
		if (topWood != specs.topWood)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return " \n GuitarSpec [builder=" + builder + ", model=" + model + ", type=" + type + ", numStrings=" + numStrings
				+ ", backWood=" + backWood + ", topWood=" + topWood + "]";
	}

}