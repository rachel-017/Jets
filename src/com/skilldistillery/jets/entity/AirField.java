package com.skilldistillery.jets.entity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class AirField {

	private List<Jet> jets;
	private String[] jetArray;

	public AirField() {
	}

	public List<Jet> readJets(String fileName) {
		List<Jet> jets = new ArrayList<>();
		try {
			BufferedReader file = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = file.readLine()) != null) {
				String[] comp = line.split(",");
				String model = comp[0];
				double speed = Double.parseDouble(comp[1]);
				int range = Integer.parseInt(comp[2]);
				long price = Long.parseLong(comp[3]);
				Jet jet = new Butterfly(model, speed, range, price);
				jets.add(jet);
			}
			file.close();
		} catch (IOException e) {
			System.err.println(e);
		}
		return jets;
	}

	public Jet fastestBug(List<Jet> jets) {
		double speedF = 0;
		Jet jetF = new Butterfly();
		for (int i = 0; i < jets.size(); i++) {
			if (i == 0) {
				speedF = jets.get(0).getSpeed();
				jetF = jets.get(0);
				// same for jet name, range, price
			}
			if (i > 0) {
				if (speedF < jets.get(i).getSpeed()) {
					speedF = jets.get(i).getSpeed();
					// if speedf is less than the speed of the list item we are at
					jetF = jets.get(i);
				}
			}
		}
		return jetF;
	}

	public Jet longestRange(List<Jet> jets) {
		int rangeL = 0;
		Jet jetR = new Butterfly();
		for (int i = 0; i < jets.size(); i++) {
			if (i == 0) {
				rangeL = jets.get(0).getRange();
				jetR = jets.get(0);
				// same for jet name, range, price
			}
			if (i > 0) {
				if (rangeL < jets.get(i).getRange()) {
					rangeL = jets.get(i).getRange();
					// if speedf is less than the speed of the list item we are at
					jetR = jets.get(i);
				}
			}
		}
		return jetR;
	}

	public List<Jet> addJet() {
		List<Jet> jets = new ArrayList<>();
		Jet fly = new Butterfly();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Bug's:\nSpeed: ");
		double speed = input.nextDouble();
		System.out.print("Range: ");
		int range = input.nextInt();
		System.out.print("And Price: ");
		long price = input.nextLong();
		fly = new Butterfly("Bug" , speed, range, price);
		jets.add(fly);
		return jets;
	}

	public List<Jet> removeJet(List<Jet> jets, int input) {
		jets.remove(input);
		return jets;
	}

	public List<Jet> jetsGatherPollen(List<Jet> jets) {
		for (Jet jetA : jets) {
			if (jetA.getSpeed() > 9 && jetA.getSpeed() < 14) {
				BumbleBee bee = new BumbleBee();
				bee.gatherPollen();
			} else if (jetA.getSpeed() > 13) {
				Wasp wasp = new Wasp();
				wasp.gatherPollen();
			}
		}
		return jets;
	}

	public List<Jet> jetsEngageCombat(List<Jet> jets) {
		for (Jet jetC : jets) {
			if (jetC.getSpeed() == 5) {
				RhinoBeetle rhino = new RhinoBeetle();
				rhino.fight();
			} else if (jetC.getSpeed() > 13) {
				Wasp wasp = new Wasp();
				wasp.fight();
			}
		}
		return jets;
	}

}
