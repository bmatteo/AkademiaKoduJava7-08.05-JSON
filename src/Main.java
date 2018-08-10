import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        Car c = new Car();
        c.brand = "BMW";
        c.model = "3";
        c.status = Status.FREE;
        c.engine = new Engine(1.8, 140, "ASDF45SDFG");

        Gson g = new Gson();
        String json = g.toJson(c);
        System.out.println(json);

        Car carFromJson = g.fromJson(json, Car.class);
        System.out.println(carFromJson.engine.power);
    }
}
