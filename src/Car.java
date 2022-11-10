public class Car {
    private int id;
    private String mark;
    private String model;
    private int year;
    private String color;
    private int price;
    private int registration_number;

    public Car(){
        this.id = 0;
        this.mark = "";
        this.model = "";
        this.year = 0;
        this.color = "";
        this.price = 0;
        this.registration_number = 0;
    }

    public Car(int id, String mark, String model, int year, String color, int price, int registration_number) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registration_number = registration_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>0) {
            this.year = year;
        } else System.out.println("Введенный год некорректный!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price>0) {
            this.price = price;
        } else System.out.println("Введена некорректная цена!");
    }

    public int getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(int registration_number) {
        this.registration_number = registration_number;
    }

    @Override
    public String toString() {
        return "Машина: " +
                "id = " + id +
                ", Марка = " + mark +
                ", Модель = " + model +
                ", Год выпуска = " + year +
                ", Цвет = " + color  +
                ", Цена = " + price +
                ", Регистрационный номер = " + registration_number;
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