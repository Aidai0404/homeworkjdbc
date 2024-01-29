import java.util.Comparator;

public class City implements Comparable<City>{
    private String id;
    private String cityName;
    private String region;
    private String district;
    private int population;
    private String foundation;

    public City(String id, String cityName, String region, String district, int population, String foundation) {
        this.id = id;
        this.cityName = cityName;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    public City() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    Comparator<City>compareByCityName = new Comparator<City>() {
        @Override
        public int compare(City o1, City o2) {
            return o1.getCityName().compareTo(o2.cityName);
        }
    };



    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", foundation='" + foundation + '\'' +
                '}';
    }

    @Override
    public int compareTo(City o) {
        return o.population;
    }
}
