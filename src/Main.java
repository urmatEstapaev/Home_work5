public class Main {
    public static void main(String[] args) {
        Boss finalBoss = new Boss();
        finalBoss.setDefence("Magical");
        finalBoss.setDamage(99);
        finalBoss.setHealth(80);
        System.out.println("Boss health :" + finalBoss.getHealth() + " Boss damage :" + finalBoss.getDamage() + " Boss defence : " + finalBoss.getDefence());
        createHeroes();

    }

    public static Hero[] createHeroes() {
        Hero firstHero = new Hero(120, 25, "Invisibility");
        Hero secondHero = new Hero(200, 15);
        Hero thirdHero = new Hero(140, 20, "strong punch");

        Hero[] heroes = {firstHero, secondHero, thirdHero};

        for (Hero hero : heroes) {
            System.out.println("Heroes health :" + hero.getHealth() + "Heroes damage :" + hero.getDamage() + "Heroes ability :" + hero.getAbility());
        }
        return heroes;
    }
}