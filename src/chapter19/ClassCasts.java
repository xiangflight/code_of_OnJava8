package chapter19;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/12
 */
class Building {}
class House extends Building {}

public class ClassCasts {

    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        System.out.println(b.getClass());
    }
}
