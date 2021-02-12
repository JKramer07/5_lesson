package com.company;

import java.security.PublicKey;

public class Boss extends GameEntity{
    private String weaponType;
    private String weaponName;

    public Boss(int health, int damage, String abilities, String defenceType, String weaponType, String weaponName) {
        super(health, damage, abilities, defenceType);
        this.weaponType = weaponType;
        this.weaponName = weaponName;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Weapon Type: " + weaponType + ", Weapon Name: " + weaponName;
    }

    //    private  int health;
//    private  int damage;
//    private  String defenceType;
//
//    public int getHealth(){
//        return health;
//    }
//
//    public void setHealth(int health){
//        this.health = health;
//    }
//
//    public int getDamage(){
//        return damage;
//    }
//
//    public void setDamage(int damage){
//        this.damage = damage;
//    }
//
//    public String getDefenceType(){
//        return defenceType;
//    }
//
//    public void setDefenceType(String defenceType){
//        this.defenceType = defenceType;
//    }
}
