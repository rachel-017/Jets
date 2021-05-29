package com.skilldistillery.jets.entity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AirField {
	private List<Jet> jets;

	public AirField() {
	}

	public List<Jet> readJets() {
		
		Set<String> jetInfo = new HashSet<>();

		BufferedReader file;
		try {
			file = new BufferedReader(new FileReader("jets.txt"));
			String line;
			while ((line = file.readLine()) != null) {
				jetInfo.add(line);
			}
			for(String info : jetInfo) {
				
				String[] splitInfo = info.split(line);
			}
	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return List<Jet> jets;
	}
}
