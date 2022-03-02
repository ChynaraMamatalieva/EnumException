package com.company;

public class Main<hybrid> {

    public static void main(String[] args) {
        Vehicle car1 = new Car("Mercedes-Benz C-Class", 2021, TypeOfEngine.ELECTROMOBILE);
        Vehicle car2 = new Car("Mercedes-Benz A-Class", 2019, TypeOfEngine.HYBRID);
        Vehicle car3 = new Car("Mercedes-Benz S-Class", 2020, TypeOfEngine.FUEL);
        Vehicle car4 = new Car("Toyota Corolla", 2120, TypeOfEngine.HYBRID);
        Vehicle car5 = new Car("Toyota Prius", 2021, TypeOfEngine.ELECTROMOBILE);
        Vehicle car6 = new Car("Toyota Camry", 2220, TypeOfEngine.FUEL);
        Vehicle car7 = new Car("Toyota Avalon", 2018, TypeOfEngine.FUEL);
        Vehicle car8 = new Car("Lexus LX 570", 2021, TypeOfEngine.HYBRID);
        Vehicle car9 = new Car("Lexus LS", 2010, TypeOfEngine.ELECTROMOBILE);
        Vehicle car10 = new Car("Lexus RX", 1918, TypeOfEngine.HYBRID);
        Vehicle truck1 = new Truck("Volvo", 2015, TypeOfEngine.FUEL);
        Vehicle truck2 = new Truck("Renault", 2019, TypeOfEngine.HYBRID);
        Vehicle truck3 = new Truck("isuzu D-Mas", 1987, TypeOfEngine.ELECTROMOBILE);
        Vehicle truck4 = new Truck("Ford F-15", 2000, TypeOfEngine.FUEL);
        Vehicle truck5 = new Truck("Mitsubishi", 1920, TypeOfEngine.HYBRID);
        Vehicle[] vehicles = {car1, car2, car3, car4, car5, car6, car7, car8, car9, car10, truck1, truck2, truck3, truck4, truck5};


        for (Vehicle vec : vehicles) {
            System.out.println(vec.getModel());
            try {
                System.out.println(vec.getYearOfIssue());
            } catch (InvalidIssueYear e) {
                System.out.println("jyly diapazongo dal kelbeit");
            }
            System.out.println(vec.getTypeOfEngine());
        }
        Vehicle[] hybrids;
        TypeOfEngine t = null;


        for (Vehicle fuel : vehicles) {
            if (fuel.getTypeOfEngine().equals(TypeOfEngine.FUEL)) {
                System.out.println(fuel.getTypeOfEngine() + " " + fuel.getModel());
            }
        }
        for (Vehicle hybrid : vehicles) {
            if (hybrid.getTypeOfEngine().equals(TypeOfEngine.HYBRID)) {
                System.out.println(hybrid.getTypeOfEngine() + " " + hybrid.getModel());
            }

        }
        for (Vehicle electromobile : vehicles) {
            if (electromobile.getTypeOfEngine().equals((TypeOfEngine.ELECTROMOBILE))) {
                System.out.println(electromobile.getTypeOfEngine() + " " + electromobile.getModel());
            }

        }
    }
}

