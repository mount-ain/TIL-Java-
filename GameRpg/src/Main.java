public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Hero hero = new Hero();
        System.out.println(boss.getHp());
        System.out.println(boss.getPower());
        System.out.println(boss.getShield());
        System.out.println(boss.getStage());

        hero.moveStage();
        System.out.println(boss.getHp());
        System.out.println(boss.getPower());
        System.out.println(boss.getShield());
        System.out.println(boss.getStage());


    }
}