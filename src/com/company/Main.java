package com.company;

import java.util.Random;

public class Main {

    public static int bossHealth = 700;
    public static int bossDamage = 50;
    public static String bossDefenceType = "";
    public static int [] heroesHealth = {360, 270, 280, 300};
    public static int [] heroesDamage = {30, 20, 15, 0};
    public static String[] heroesAttackType = {"Physical", "Magical", "Mental", "Medical"};


    public static void main(String[] args) {


        while (!isFinished()){
            round();
        }
        while (heroesHealth[3] > 0){
            medicTreats();
        }
    }

    public static void round(){
        Boss();
        printStatistics();
        System.out.println("Round was started!");
        heroesHit();
        changeBossDefenceType();
        bossHit();
        medicTreats();
        printStatistics();
    }

    public static void printStatistics(){
        System.out.println("----------------------");
        System.out.println("Boss Health: " + bossHealth);
        System.out.println("Warrior Health: " + heroesHealth[0]);
        System.out.println("Mag Health: " + heroesHealth[1]);
        System.out.println("Kinetic Health: " + heroesHealth[2]);
        System.out.println("Medic Health " + heroesHealth[3]);
        System.out.println("----------------------");
    }

    public static void bossHit(){
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0 && bossHealth > 0) {
                if (heroesHealth[i] - bossDamage < 0) heroesHealth[i] = 0;
                else heroesHealth[i] = heroesHealth[i] - bossDamage;
                }
            }
        }

    public static void heroesHit(){
        for (int i = 0; i < heroesHealth.length; i++) {
            if (bossHealth > 0 && heroesHealth[i] > 0){
                if (bossHealth - heroesDamage[i] < 0) bossHealth = 0;
                else bossHealth = bossHealth - heroesDamage[i];
            }
        }
    }

    public static boolean isFinished(){
        if (bossHealth <= 0){
            System.out.println("Heroes won!");
            return true;
        }
        if (heroesHealth[0] <= 0 && heroesHealth[1] <= 0 && heroesHealth[2] <= 0){
            System.out.println("Boss won!");
            return true;
        }
        return false;
    }

    public static void changeBossDefenceType(){
        Random random = new Random();
        int randomIndex = random.nextInt(heroesAttackType.length);
        bossDefenceType = heroesAttackType[randomIndex];
        System.out.println("Boss defence type: " + bossDefenceType);
    }

    public static void medicTreats(){
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[3] > 0 && heroesHealth[i] < 100) {
                Random r = new Random();
                int random = r.nextInt(50);
                heroesHealth[i] = heroesHealth[i] + random;
                System.out.println("Medic healed [" + heroesAttackType[i] + "] by [" + random + "]");
                break;
            }
        }
    }

    public static void Boss(){
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefenceType("Random defence");
        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Defence type: " + boss.getDefenceType());
    }


    public String createHeroes(){
        Hero hero1 = new Hero(250, 30, "Berserk");
        Hero hero2 = new Hero(280, 25);
        Hero hero3 = new Hero(200, 20, "Magic");

        String[] heroesArray = {"hero1", "hero2", "hero3"};
        return;
    }


}
