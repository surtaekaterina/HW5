public class State {

	String name;
	Region[] regionArr;

	public State(String name, int regionCount) {
		this.name = name;
		this.regionArr = new Region[regionCount];
	}

	public void addRegion(Region region) {
		for (int i = 0; i < regionArr.length; i++) {
			if (regionArr[i] == null) {
				regionArr[i] = region;
				break;
			}
		}
	}

	public String findTheCapital() {
		String theCapital = "";
		for (int i = 0; i < regionArr.length; i++) {
			Region temp = regionArr[i];
			for (int j = 0; j < temp.cityArr.length; j++) {
				if (temp.cityArr[j].isCapital == true) {
					theCapital = temp.cityArr[j].name;
					break;
				}
			}
		}
		return theCapital;
	}

	public int countOfRegions() {
		int result = regionArr.length;
		return result;
	}

	public double countTotalArea() {
		double totalArea = 0;
		for (int i = 0; i < regionArr.length; i++) {
			Region temp = regionArr[i];
			for (int j = 0; j < temp.cityArr.length; j++) {
				totalArea = totalArea + temp.cityArr[j].square;
			}
		}
		return totalArea;
	}

	public City[] findRegionCenters() {
		int k = 0;
		City[] regionCenters = new City[regionArr.length];
		for (int i = 0; i < regionArr.length; i++) {
			Region temp = regionArr[i];
			for (int j = 0; j < temp.cityArr.length; j++) {
				if (temp.cityArr[j].isRegionCenter == true) {
					regionCenters[k] = temp.cityArr[j];
					k++;

				}
			}
		}
		return regionCenters;
	}
}