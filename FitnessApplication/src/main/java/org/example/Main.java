package org.example;

public class Main {
    public static void main(String[] args) {
        User u = new User();
        u.setUserName("Anusha");
        u.setAge(22);
        u.setSex("Female");
        u.setHeight(5.3);
        u.setCurrentWeight(84.0);
        u.setTargetWeight(65.0);

        DietPlan d = new DietPlan();
        d.setBurnCalories(1000);
        d.setDrinkNumOfGlasses(7);

        System.out.println("User Name:" + u.getUserName());
        System.out.println("User Age:" + u.getAge());
        System.out.println("User Sex:" + u.getSex());
        System.out.println("User Height:" + u.getHeight());
        System.out.println("User Current Weight:" + u.getCurrentWeight());
        System.out.println("User Target Weight:" + u.getTargetWeight());
        System.out.println("Daily Burn Calories:" + d.getBurnCalories());
        System.out.println(" Drink" + d.getDrinkNumOfGlasses() + "glasses of water");


    }
}