package OOP;

public class CountryRoadTakeMeHome {
    private double population;
    private double area;
    private String name;
    private String code;
    public CountryRoadTakeMeHome(double population, double area, String name, String code) {
        this.population = population;
        this.area = area;
        this.name = name;
        this.code = code;
    }


    public void setCode(String code) {
        if (code.length() == 3){
            this.code = code;
        }
    }

    public void setPopulation(double population) {
        if (population > 0){
            this.population = population;
        }
    }


    private double getPopulation() {
        return population;
    }

    private double getArea() {
        return area;
    }

    private String getName() {
        return name;
    }

    private String getCode() {
        return code;
    }
}

