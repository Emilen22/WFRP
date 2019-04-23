import java.util.Random;
import java.util.Scanner;

public class HeroRaces {
    public static void main(String[] args) {
        HeroStatistics[] races = new HeroStatistics[4];
        //human
        races[0] = new HeroStatistics(2,20,20,1,1,4,
                20,1,20,20,20,20,20);
        //elf
        races[1] = new HeroStatistics(2,30,20,1,1,3,
                50,1,30,40,40,30,30);
        //dwarf
        races[2] = new HeroStatistics(2,30,10,1,2,5,
                10,1,10,20,40,40,10);
        //halfling
        races[3] = new HeroStatistics(2,10,20,0,0,3,
                40,1,30,20,10,30,30);

        Scanner ra = new Scanner(System.in);

        System.out.println("Races:\n1.Human\n2.Elf\n3.Dwarf\n4.Halfling\n");
        System.out.println("Select character race by typing position number:");

        int character = ra.nextInt();

        if (character == 1) {
            System.out.println("Human\n");
        } else if (character == 2) {
            System.out.println("Elf\n");
        } else if (character == 3) {
            System.out.println("Dwarf\n");
        } else if (character == 4) {
            System.out.println("Halfling\n");
        }

        Random rand = new Random();
        //Human rands
        if (character == 1) {
        int HmM = rand.nextInt(2)+1 + races[0].getMovement();
        int HwSM = rand.nextInt(9)+1 + (rand.nextInt(9)+1
                + races[0].getWeaponSkill());
        int HbSM = rand.nextInt(9)+1 + (rand.nextInt(9)+1
                + races[0].getBallisticSkill());
        int HsM = rand.nextInt(2)+1 + races[0].getStrength();
        int HtM = rand.nextInt(2)+1 + races[0].getToughness();
        int HwM = rand.nextInt(2)+1 + races[0].getWounds();
        int HiM = rand.nextInt(9)+1 + (rand.nextInt(9)+1
                + races[0].getInitiative());
        int HaM = races[0].getAttacks();
        int HdexM = rand.nextInt(9)+1 + (rand.nextInt(9)+1
                + races[0].getDexterity());
        int HinM = rand.nextInt(9)+1 + (rand.nextInt(9)+1
                + races[0].getIntelligence());
        int HclM = rand.nextInt(9)+1 + (rand.nextInt(9)+1
                + races[0].getCool());
        int HwpM = rand.nextInt(9)+1 + (rand.nextInt(9)+1
                + races[0].getWillPower());
        int HfelM = rand.nextInt(9)+1 + (rand.nextInt(9)+1
                + races[0].getFellowship());

            System.out.println("Hero Statistics:");
            System.out.println("M:" + HmM + " WS:" + HwSM + " BS:" + HbSM + " S:" + HsM + " T:" + HtM
            + " W:" + HwM + " I:" + HiM + " A:" + HaM + " Dex:" + HdexM + " Int:" + HinM + " C:" + HclM
            + " WP:" + HwpM + " F:" + HfelM);

            System.out.println(" ");

            if (HwSM >= 30) {
                System.out.println("You can choose Warrior");
            }else {
                System.out.println("Your Weapon Skill is to low");
            }
            System.out.println(HwSM);

            if (HbSM >= 30) {
                System.out.println("You can choose Ranger");
            }else {
                System.out.println("Your Ballistic Skill is to low");
            }
            System.out.println(HbSM);

            if (HiM >= 30) {
                System.out.println("You can choose Rogue");
            }else {
                System.out.println("Your Initiative is to low");
            }
            System.out.println(HiM);

            if (HinM >= 30) {
                if (HwpM >= 30)
                System.out.println("You can choose Academics");
            }else {
                System.out.println("Your Intelligence and Will Power is to Low");
            }
            System.out.println(HinM);
            System.out.println(HwpM);

            //Elf rands
        } else if (character == 2) {
            int EmM = rand.nextInt(2)+1 + races[1].getMovement();
            int EwSM = rand.nextInt(9)+1 + (rand.nextInt(9)+1
                    + races[1].getWeaponSkill());
            int EbSM = rand.nextInt(9)+1 + (rand.nextInt(9)+1
                    + races[1].getBallisticSkill());
            int EsM = rand.nextInt(2)+1 + races[1].getStrength();
            int EtM = rand.nextInt(2)+1 + races[1].getToughness();
            int EwM = rand.nextInt(2)+1 + races[1].getWounds();
            int EiM = rand.nextInt(9)+1 + (rand.nextInt(9)+1
                    + races[1].getInitiative());
            int EaM = races[1].getAttacks();
            int EdexM = rand.nextInt(9)+1 + (rand.nextInt(9)+1
                    + races[1].getDexterity());
            int EinM = rand.nextInt(9)+1 + (rand.nextInt(9)+1
                    + races[1].getIntelligence());
            int EclM = rand.nextInt(9)+1 + (rand.nextInt(9)+1
                    + races[1].getCool());
            int EwpM = rand.nextInt(9)+1 + (rand.nextInt(9)+1
                    + races[1].getWillPower());
            int EfelM = rand.nextInt(9)+1 + (rand.nextInt(9)+1
                    + races[1].getFellowship());

            System.out.println("Hero Statistics:");
            System.out.println("M:" + EmM + " WS:" + EwSM + " BS:" + EbSM + " S:" + EsM + " T:" + EtM
                    + " W:" + EwM + " I:" + EiM + " A:" + EaM + " Dex:" + EdexM + " Int:" + EinM + " C:" + EclM
                    + " WP:" + EwpM + " F:" + EfelM);

            System.out.println(" ");

            if (EwSM >= 30) {
                System.out.println("You can choose Warrior");
            }else {
                System.out.println("Your Weapon Skill is to low");
            }
            System.out.println(EwSM);

            if (EbSM >= 30) {
                System.out.println("You can choose Ranger");
            }else {
                System.out.println("Your Ballistic Skill is to low");
            }
            System.out.println(EbSM);

            if (EiM >= 65) {
                System.out.println("You can choose Rogue");
            }else {
                System.out.println("Your Initiative is to low");
            }
            System.out.println(EiM);

            if (EinM >= 30) {
                if (EwpM >= 30)
                System.out.println("You can choose Academics");
            }else {
                System.out.println("Your Intelligence and Will Power is to Low");
            }
            System.out.println(EinM);
            System.out.println(EwpM);
        } else if (character == 3) {

        }

    }
}
