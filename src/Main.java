public class Main {
    public static void main(String[] args) {

        Boss myBoss = new Boss();
        myBoss.setHealth(500);
        myBoss.setDamage(100);
        myBoss.setTypeOfDefence("Physical");

        System.out.println("Boss Health is: " + myBoss.getHealth() + " Damage is: " + myBoss.getDamage() + " Type of defence is: " + myBoss.getTypeOfDefence());

    }
}