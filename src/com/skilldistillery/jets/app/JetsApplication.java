package com.skilldistillery.jets.app;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entity.*;

public class JetsApplication {

	private AirField airField = new AirField();

	public static void main(String[] args) {
		JetsApplication jApp = new JetsApplication();
		jApp.loadJets();
	}

	public void loadJets() {
		airField = new AirField();
		List<Jet> jets = airField.readJets("jets.txt");
		menu(jets);
	}

	public void menu(List<Jet> jets) {
		airField = new AirField();
		Jet jet = new Butterfly();
		
		int selection = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("~~Welcome to the Bug Field!~~\n");
		while (selection != 9) {
			System.out.println("\t\t~Menu~");
			System.out.println("1) List all Bugs");
			System.out.println("2) Fly all Bugs");
			System.out.println("3) See Fastest Bug");
			System.out.println("4) See the Bug with the Longest Range");
			System.out.println("5) Send Bugs to Collect Pollen");
			System.out.println("6) Send Bugs to Fight");
			System.out.println("7) Add a Bug to the Field");
			System.out.println("8) Remove a Bug from the Field");
			System.out.println("9) Quit");
			selection = input.nextInt();
			
			if (selection == 1) {
				listBugs(jets);
			} else if (selection == 2) {
				for (Jet jetL : jets) {
					jetL.fly();
				}
			} else if (selection == 3) {
				jet = airField.fastestBug(jets);
				System.out.println("The fastest bug in the field is the " + jet.getModel());

			} else if (selection == 4) {
				jet = airField.longestRange(jets);
				System.out.println("The bug that can fly the farthest is the " + jet.getModel());

			} else if (selection == 5) {
				airField.jetsGatherPollen(jets);

			} else if (selection == 6) {
				airField.jetsEngageCombat(jets);

			} else if (selection == 7) {
				List<Jet> newJets = airField.addJet();
				jets.addAll(newJets);

			} else if (selection == 8) {
				int x = 0;
				System.out.println("Choose the bug to be removed:");
				for (Jet jetR : jets) {
					System.out.println(x + ". " + jetR.getModel());
					x++;
				}
				int remove = input.nextInt();
				List<Jet> jetRemoved = airField.removeJet(jets, remove);
				jets = jetRemoved;

			} else {
				System.out.println("~~Thanks for visiting the Bug Field!~~");
			}
		}
		input.close();
	}

	public void listBugs(List<Jet> jets) {
		for (Jet jet : jets) {
			System.out.println(jet.toString());
		}
	}

}
