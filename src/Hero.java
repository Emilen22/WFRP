public class Hero {

    private String heroName;
    private String heroRace;
    private String heroSex;
    private String heroSpeciality;
    private String heroProfession;
    private String heroHair;
    private String heroEyeColor;
    private int heroAge;
    private double heroHeight;
    private double heroWeight;

    public Hero(String heroName, String heroRace, String heroSex, String heroSpeciality, String heroProfession,
                String heroHair, String heroEyeColor, int heroAge, double heroHeight, double heroWeight) {
        this.heroName = heroName;
        this.heroRace = heroRace;
        this.heroSex = heroSex;
        this.heroSpeciality = heroSpeciality;
        this.heroProfession = heroProfession;
        this.heroHair = heroHair;
        this.heroEyeColor = heroEyeColor;
        this.heroAge = heroAge;
        this.heroHeight = heroHeight;
        this.heroWeight = heroWeight;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroRace() {
        return heroRace;
    }

    public void setHeroRace(String heroRace) {
        this.heroRace = heroRace;
    }

    public String getHeroSex() {
        return heroSex;
    }

    public void setHeroSex(String heroSex) {
        this.heroSex = heroSex;
    }

    public String getHeroSpeciality() {
        return heroSpeciality;
    }

    public void setHeroSpeciality(String heroSpeciality) {
        this.heroSpeciality = heroSpeciality;
    }

    public String getHeroProfession() {
        return heroProfession;
    }

    public void setHeroProfession(String heroProfession) {
        this.heroProfession = heroProfession;
    }

    public String getHeroHair() {
        return heroHair;
    }

    public void setHeroHair(String heroHair) {
        this.heroHair = heroHair;
    }

    public String getHeroEyeColor() {
        return heroEyeColor;
    }

    public void setHeroEyeColor(String heroEyeColor) {
        this.heroEyeColor = heroEyeColor;
    }

    public int getHeroAge() {
        return heroAge;
    }

    public void setHeroAge(int heroAge) {
        this.heroAge = heroAge;
    }

    public double getHeroHeight() {
        return heroHeight;
    }

    public void setHeroHeight(double heroHeight) {
        this.heroHeight = heroHeight;
    }

    public double getHeroWeight() {
        return heroWeight;
    }

    public void setHeroWeight(double heroWeight) {
        this.heroWeight = heroWeight;
    }
}
