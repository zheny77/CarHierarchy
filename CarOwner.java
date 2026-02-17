public class CarOwner {
    public static void main(String[] args) {
        // Часть 2: Тест обычного автомобиля
        System.out.println("=== Тест-драйв обычного автомобиля ===");
        Car myCar = new Car();
        myCar.start();
        
        // Вызываем drive и сохраняем результат
        int distance1 = myCar.drive(5);
        // Печатаем результат, как требуется в задании
        System.out.println("Итоговый пробег по одометру: " + distance1 + " км");
        
        myCar.stop();

        System.out.println("\n=== Спецзадание агента 007 ===");
        // Часть 3: Тест автомобиля Джеймса Бонда
        Car bondCar = new JamesBondCar();
        bondCar.start(); // Использует метод родительского класса
        
        // Вызываем переопределенный метод drive
        int distance2 = bondCar.drive(5);
        // Печатаем результат
        System.out.println("Дистанция погони зафиксирована спутником: " + distance2 + " км");
        
        bondCar.stop(); // Использует метод родительского класса
    }
}
