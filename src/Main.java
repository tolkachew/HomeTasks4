import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Запустить приложение? (yes/no)");
        String n = sc.next();
        switch (n) {
            case "yes" -> {
                Car[] cars_list = car();        //auto
                // Car[] cars_list = cars_list();     //enter
                System.out.println("Вывести список автомобилей заданной марки.");
                System.out.print("Введите марку автомобиля: ");
                markCheck(cars_list, sc.next());
                System.out.println("Введите список автомобилей заданной модели, которые эксплуатируются больше n лет.");
                System.out.print("Введите модель автомобиля: ");
                String model = sc.next();
                System.out.print("Введите количетво лет эксплуатации: ");
                modelCheck(cars_list, model, sc.nextInt());
                System.out.println("Вывести список автомобилей заданного года выпуска, цена которых больше указанной.");
                System.out.print("Введите год выпуска: ");
                int year = sc.nextInt();
                System.out.print("Введите цену: ");
                yearCheck(cars_list, year, sc.nextInt());
            }
            case "no" -> System.exit(0);
            default -> System.out.println("Введите 'yes' или 'no'");
        }
    }

    static Car[] car() {
        Car[] cars = new Car[6];
        cars[0] = new Car(1, "Hyundai", "Creta", 2020, "gray", 2000, 9099);
        cars[1] = new Car(2, "BMW", "M4", 2018, "green", 4000, 4040);
        cars[2] = new Car(3, "BMW", "7", 2015, "black", 2500, 1251);
        cars[3] = new Car(4, "Audi", "A5", 2010, "red", 1900, 3371);
        cars[4] = new Car(5, "Audi", "s3", 2021, "pink", 3500, 1101);
        cars[5] = new Car(6, "Toyota", "Land Cruiser", 2009, "white", 3000, 3312);

        return cars;
    }

    static Car[] cars_list() {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Введите количество автомобилей: ");
        Car[] cars = new Car[sc1.nextInt()];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            System.out.println();
            System.out.print("Введите id: ");
            cars[i].setId(sc1.nextInt());
            System.out.print("Введите марку: ");
            cars[i].setMark(sc1.next());
            System.out.print("Введите модель: ");
            cars[i].setModel(sc1.next());
            System.out.print("Введите год выпуска: ");
            cars[i].setYear(sc1.nextInt());
            System.out.print("Введите цвет: ");
            cars[i].setColor(sc1.next());
            System.out.print("Введите цену: ");
            cars[i].setPrice(sc1.nextInt());
            System.out.print("Введите регистрационный номер: ");
            cars[i].setRegistration_number(sc1.nextInt());
        }
        return cars;
    }

    static void markCheck(Car[] cars, String mark) {
        for (Car car : cars) {
            if (car.getMark().equals(mark))
                System.out.println(car.toString());
        }
        System.out.println();
    }

    static void modelCheck(Car[] cars, String model, int n) {
        for (Car car : cars) {
            if (car.getModel().equals(model) && (2022 - car.getYear()) > n) {
                System.out.println(car.toString());
            }
        }
        System.out.println();
    }

    static void yearCheck(Car[] cars, int year, int price) {
        for (Car car : cars) {
            if (car.getYear() == year && car.getPrice() > price)
                System.out.println(car.toString());
        }
    }
}
/*
Создать классы, спецификации которых приведены ниже. Определить кон-
структоры и методы set(), get(), toString(). Определить дополнительно
методы в классе, создающем массив объектов. Задать критерий выбора данных
и вывести эти данные на консоль. В каждом классе, обладающем информацией,
должно быть объявлено несколько конструкторов.
Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
Создать массив объектов. Вывести:
a) список автомобилей заданной марки;
b) список автомобилей заданной модели, которые эксплуатируются боль-
ше n лет;
c) список автомобилей заданного года выпуска, цена которых больше ука-
занной.
 */