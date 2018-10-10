
public class MainAppState {

	public static void main(String[] args) {

		City minsk = new City("Minsk", true, true, 123.43d);
		City dzyarzhinsk = new City("Dzyarzhinsk", false, false, 55.09d);
		City logojsk = new City("Logojsk", false, false, 13.43d);

		City gomel = new City("Gomel", false, true, 166.43d);
		City zhlobin = new City("Zhlobin", false, false, 88.3d);
		City rechitsa = new City("Rechitsa", false, false, 53.43d);

		City mogilev = new City("Mogilev", false, true, 123.43d);
		City bobrujsk = new City("Bobrujsk", false, false, 32.23d);
		City glusk = new City("Glusk", false, false, 123.43d);

		City grodno = new City("Grodno", false, true, 123.43d);
		City lida = new City("Lida", false, false, 123.43d);
		City smorgon = new City("Smorgon", false, false, 83.43d);

		City brest = new City("Brest", false, true, 91.43d);
		City baranovichi = new City("Baranovichi", false, false, 58.43d);
		City ivanovo = new City("Ivanovo", false, false, 16.43d);

		City vitebsk = new City("Vitebsk", false, true, 123.43d);
		City orsha = new City("Orsha", false, false, 123.43d);
		City polotsk = new City("Polotsk", false, false, 123.43d);

		Region minskaya = new Region(3);

		minskaya.addCity(minsk);
		minskaya.addCity(dzyarzhinsk);
		minskaya.addCity(logojsk);

		Region gomelskaya = new Region(3);

		gomelskaya.addCity(gomel);
		gomelskaya.addCity(zhlobin);
		gomelskaya.addCity(rechitsa);

		Region mogilevskaya = new Region(3);

		mogilevskaya.addCity(mogilev);
		mogilevskaya.addCity(bobrujsk);
		mogilevskaya.addCity(glusk);

		Region grodnenskaya = new Region(3);

		grodnenskaya.addCity(grodno);
		grodnenskaya.addCity(lida);
		grodnenskaya.addCity(smorgon);

		Region brestskaya = new Region(3);

		brestskaya.addCity(brest);
		brestskaya.addCity(baranovichi);
		brestskaya.addCity(ivanovo);

		Region vitebskaya = new Region(3);

		vitebskaya.addCity(vitebsk);
		vitebskaya.addCity(orsha);
		vitebskaya.addCity(polotsk);

		State belarus = new State("Belarus", 6);

		belarus.addRegion(minskaya);
		belarus.addRegion(gomelskaya);
		belarus.addRegion(mogilevskaya);
		belarus.addRegion(grodnenskaya);
		belarus.addRegion(brestskaya);
		belarus.addRegion(vitebskaya);

		String theCapital = belarus.findTheCapital();
		System.out.println("The capital is: " + theCapital);

		int numberOfRegions = belarus.countOfRegions();
		System.out.println("Number of regions: " + numberOfRegions);

		double totalArea = belarus.countTotalArea();
		System.out.println("Total country area:  " + totalArea);

		City[] regionCenters = belarus.findRegionCenters();
		System.out.println("Region Centers:  " );
		for (int i = 0; i < regionCenters.length; i++) {
			System.out.println(regionCenters[i].name);
			
		}

	}

}
