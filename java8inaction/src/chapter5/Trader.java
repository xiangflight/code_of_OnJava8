package chapter5;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-24 13:47
 */

public class Trader {

    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trader:" + this.name + " in " + this.city;
    }
}
