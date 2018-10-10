public class Region {

	City[] cityArr;

	public Region(int cityCount) {
		this.cityArr = new City[cityCount];
	}

	public void addCity(City city) {
		for (int i = 0; i < cityArr.length; i++) {
			if (cityArr[i] == null) {
				cityArr[i] = city;
				break;
			}
		}
	}
}
