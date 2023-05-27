public class Contestant {
    private String name;
    private String country;
    private String[] talents;
    private int age;
    private int talentCount;
    private static final MAX_TALENTS;

    public Contestant(String n, String c) {
        this.name = n;
        this.country = c;
        this.age = 18;
        this.talents = new String[3];
        this.talentCount = 0;
    }

    public Contestant(String n, String c, int a) {
        this(n, c);
        this.age = 18;
    }

    public String getName() {
        return this.name;
    }

    public String getCountry() {
        return this.country;
    }

    public void addTalent(String t) {
        if(this.talentCount != 3) {
            talents[this.talentCount] = t;
            this.talentCount++;
        }
    }

    public boolean canCompete(String t) {
        int i;
        for(i = 0; i < 3; i++) {
            if( this.talents[i].equals(t) ) {
                return true;
            }
        }
        return false;
    }

    public boolean canCompete(String t, int maxAge) {
        return canCompete(t) && this.age <= maxAge;
    }
}