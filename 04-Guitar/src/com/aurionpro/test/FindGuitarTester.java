package com.aurionpro.test;

import java.util.Iterator;
import java.util.List;

import com.aurionpro.model.Builder;
import com.aurionpro.model.Guitar;
import com.aurionpro.model.GuitarSpec;
import com.aurionpro.model.Inventory;
import com.aurionpro.model.Type;
import com.aurionpro.model.Wood;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
	//	System.out.println(inventory);

		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER,
				Wood.ALDER);
		List matchingGuitars = inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("----------------------------------");
			System.out.println("Erin, you might like these guitars:");
			for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpec spec = guitar.getSpecs();
				System.out.println("  We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType()
						+ " guitar:\n  " + spec.getBackWood() + " back and sides,\n  " + spec.getTopWood()
						+ " top.\n  You can have it for only $" + guitar.getPrice() + "!");
				System.out.println("--------------------------------------");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}

	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("101", 5555,
				new GuitarSpec(Builder.COLLINGS, "DMS", Type.ACOUSTIC, 6, Wood.INDIAN_ROSEWOOD, Wood.SITKA));
		inventory.addGuitar("102", 3223.95,
				new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER));
		inventory.addGuitar("201", 6275.95,
				new GuitarSpec(Builder.MARTIN, "MJ5", Type.ACOUSTIC, 12, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
		inventory.addGuitar("202", 11995.95,
				new GuitarSpec(Builder.OLSON, "AKS", Type.ELECTRIC, 12, Wood.INDIAN_ROSEWOOD, Wood.CEDAR));
		inventory.addGuitar("301", 8009.95,
				new GuitarSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC, 12, Wood.COCOBOLO, Wood.CEDAR));
		inventory.addGuitar("302", 2100.95,
				new GuitarSpec(Builder.PRS, "Dave Navarro Signature", Type.ELECTRIC, 6, Wood.MAHOGANY, Wood.MAPLE));
	}

}