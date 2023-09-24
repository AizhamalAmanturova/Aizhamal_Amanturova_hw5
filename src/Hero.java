public class Hero {
    private int health;
    private int damage;
    private String superAbility;

    public Hero(int Health, int Damage, String SuperAbility) {
        this.health = Health;
        this.damage = Damage;
        this.superAbility = SuperAbility;
    }

    public Hero(int Health, int Damage) {
        this.health = Health;
        this.damage = Damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }
}
