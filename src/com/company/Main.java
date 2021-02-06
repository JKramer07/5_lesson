package com.company;

import java.util.Random;

public class Main {

    public static int bossHealth = 700;
    public static int bossDamage = 50;
    public static String bossDefenceType = "";
    public static int [] heroesHealth = {260, 270, 380, 200};
    public static int [] heroesDamage = {10, 20, 5, 0};
    public static String[] heroesAttackType = {"Physical", "Magical", "Mental", "Medical"};


    public static void main(String[] args) {
        while (!isFinished()){
            round();
        }
        while (heroesHealth[3] <= 0){
            isFinished();
        }

    }

    public static void round (){
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

    public static void changeBossDefenceType (){
        Random random = new Random();
        int randomIndex = random.nextInt(heroesAttackType.length);
        bossDefenceType = heroesAttackType[randomIndex];
        System.out.println("Boss defence type: " + bossDefenceType);
    }

    public static void medicTreats() {
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] < 100) {
                Random r = new Random();
                int random = r.nextInt(50);
                heroesHealth[i] = heroesHealth[i] + random;
                System.out.println("Medic healed [" + heroesAttackType[i] + "] by [" + random + "]");
                break;
            }
        }
    }
}
