public class CarOwner {
    public static void main(String[] args) {
        
        System.out.println("=== Тест-драйв обычного автомобиля ===");
        Car myCar = new Car();
        myCar.start();
        
       
        int distance1 = myCar.drive(5);
        
        System.out.println("Итоговый пробег по одометру: " + distance1 + " км");
        
        myCar.stop();

        System.out.println("\n=== Спецзадание агента 007 ===");
      
        Car bondCar = new JamesBondCar();
        bondCar.start();
        
        
        int distance2 = bondCar.drive(5);
       
        System.out.println("Дистанция погони зафиксирована спутником: " + distance2 + " км");
        
        bondCar.stop(); // Использует метод родительского класса
    }
}
