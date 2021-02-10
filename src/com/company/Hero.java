package com.company;

public class Hero {
    private int health;
    private String abilities;
    private int damage;

    public Hero(int health, int damage, String abilities){
        this.health = health;
        this.damage = damage;
        this.abilities = abilities;
    }

    public Hero(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public Hero(){
    }

    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }

    public String getAbilities(){
        return abilities;
    }
    public void setAbilities(String abilities){
        this.abilities = abilities;
    }

    public int getDamage(){
        return damage;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }

    public String getIngo(){
        return ("Health " + health + ", Damage " + damage + ", Abilities " + abilities);
    }
}
