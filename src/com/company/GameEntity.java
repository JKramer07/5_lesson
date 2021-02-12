package com.company;

public class GameEntity {
    private int health;
    private int damage;
    private String abilities;
    private String defenceType;

    public GameEntity(int health, int damage, String abilities, String defenceType){
        this.health = health;
        this.damage = damage;
        this.abilities = abilities;
        this.defenceType = defenceType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefenceType() {
        return defenceType;
    }

    public void setDefenceType(String defenceType) {
        this.defenceType = defenceType;
    }

    public String getInfo(){
        return ("Health: " + health + ", Damage: " + damage + ", Abilities: " + abilities + ", Defence: " + defenceType);
    }
}
