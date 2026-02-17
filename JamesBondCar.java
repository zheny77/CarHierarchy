public class JamesBondCar extends Car {
    @Override
    public int drive(int howlong) {
        int distance = howlong * 180;
        System.out.println("Активация турбо-ускорителя! Агент 007 пролетел " + distance + " км всего за " + howlong + " ч. Враги отстали!");
        return distance;
    }
}
