public class HeroRaces {
    public static void main(String[] args) {
        HeroStatistics[] races = new HeroStatistics[4];
        //human
        races[0] = new HeroStatistics(2,20,20,1,1,4,
                20,1,20,20,20,20,20);
        //dwarf
        races[1] = new HeroStatistics(2,30,20,1,1,3,
                50,1,30,40,40,30,30);
        //elf
        races[2] = new HeroStatistics(2,30,10,1,2,5,
                10,1,10,20,40,40,10);
        //halfling
        races[3] = new HeroStatistics(2,10,20,0,0,3,
                40,1,30,20,10,30,30);
    }
}
