abstract class Coffee {
    abstract String prepare();
}

class Espresso extends Coffee {
    String prepare() {
        return "Espresso is ready!";
    }
}

class Latte extends Coffee {
    String prepare() {
        return "Latte is ready!";
    }
}

class Cappuccino extends Coffee {
    String prepare() {
        return "Cappuccino is ready!";
    }
}

class Americano extends Coffee {
    String prepare() {
        return "Americano is ready!";
    }
}

class Mocha extends Coffee {
    String prepare() {
        return "Mocha is ready!";
    }
}

class CoffeeMachine {
    String makeCoffee(Coffee coffee) {
        return coffee.prepare();
    }
}

public class task1{
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        System.out.println(coffeeMachine.makeCoffee(new Espresso()));
        System.out.println(coffeeMachine.makeCoffee(new Latte()));
        System.out.println(coffeeMachine.makeCoffee(new Cappuccino()));
        System.out.println(coffeeMachine.makeCoffee(new Americano()));
        System.out.println(coffeeMachine.makeCoffee(new Mocha()));
    }
}
