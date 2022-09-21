package se.iths.ovningsuppgifter.Kap7.Ovningsuppgift;

public class Person {
    private String name;
    private String work;
    private int age;
    private double money;

    public Person(String name, String work, int age, double money){
        this.name = name;
        this.work = work;
        this.age = age;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }


    public void setMoney(double money) {
        if(money > 0)
            this.money += money;

        if(money < 0)
            this.money -= money;
    }
}
