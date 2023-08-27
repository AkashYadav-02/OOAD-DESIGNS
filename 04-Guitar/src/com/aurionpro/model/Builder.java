package com.aurionpro.model;
public enum Builder {
	FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

	public String toString() {
		switch (this) {
		case FENDER:
			return "Fender";
		case MARTIN:
			return "Martin";
		case GIBSON:
			return "Gibson";
		case OLSON:
			return "Olson";
		case RYAN:
			return "Ryan";
		case PRS:
			return "Prs";
		case ANY:
			return "Any";
		default:
			return null;
		}
	}
}