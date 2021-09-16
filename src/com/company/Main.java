package com.company;

public class Main {

	public static void main(String[] args) {
		Boss boss = new Boss();
		boss.setHealth(450);
		boss.setDamage(40);
		boss.weapon.setWeaponName("crossbow");
		boss.weapon.setWeaponType("wood");
		System.out.println(boss.printInfo());

		Skeleton skeleton1 = new Skeleton();
		skeleton1.setDamage(30);
		skeleton1.setHealth(250);
		skeleton1.weapon.setWeaponName("bow");
		skeleton1.weapon.setWeaponType("arrow");
		System.out.println(skeleton1.printInfo());

		Skeleton skeleton2 = new Skeleton();
		skeleton2.setDamage(30);
		skeleton2.setHealth(250);
		skeleton2.weapon.setWeaponName("bow");
		skeleton2.weapon.setWeaponType("arrow");
		System.out.println(skeleton1.printInfo());


	}
}
