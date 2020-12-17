package com.youcode.polymEX2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bibliotheque implements Serializable {
	private List<Ouvrage> ouvrages;

	public Bibliotheque() {
		ouvrages = new ArrayList<Ouvrage>();
		// ArrayList<Ouvrage>ouvrages = new ArrayList<Ouvrage>();
	}

	public void addBook(Ouvrage book) {
		ouvrages.add(book);
	}

	@Override
	public String toString() {
		String total = "enter 1";
		/*
		 * for (int i = 0; i < ouvrages.size(); i++) { Ouvrage b =
		 * ouvrages.get(i); total = total + b.toString(); }
		 */
		Iterator<Ouvrage> i = ouvrages.iterator();
		while (i.hasNext()) {
			Ouvrage b = (Ouvrage) i.next();
			total = total + b.toString();
		}
		return total;
	}
}
