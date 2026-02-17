public class Car {
    public void start() {
        System.out.println("Вставляем ключ, поворот... Двигатель ожил и приятно урчит. Готовы к приключениям!");
    }

    public void stop() {
        System.out.println("Приехали. Глушим мотор, ставим на ручник. Путешествие завершено.");
    }

    public int drive(int howlong) {
        int distance = howlong * 60;
        System.out.println("Едем спокойно, соблюдая правила. За " + howlong + " ч. проехали " + distance + " км.");
        return distance;
    }
}
