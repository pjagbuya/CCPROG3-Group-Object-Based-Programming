public class Contestant {

    private String name;
    private String country;
    private String[] talents;
    private int age;

    public Contestant(String n, String c, int a) {
        this(n, c);
        this.age = a;
    }

    public Contestant(String n, String c) {
        
        this.name = n;
        this.country = c;
        this.age = 18;
        this.talents = new String[3];

    }


    public String getName() {
        return this.name;
    }

    public String getCountry() {
        return this.country;
    }

    public void addTalent(String t) {
        
        int i = 0;
        while (i < this.talents.length && this.talents[i] != null){
            i++;
        }
        
        if (i < this.talents.length){
            talents[i] = t;
        }

    }

    public boolean canCompete(String t) {

        int i;
        for(i = 0; i < this.talents.length; i++) 
        {
            if( this.talents[i] != null && this.talents[i].equalsIgnoreCase(t) ) {
                return true;
            }
        }
        return false;

    }

    public boolean canCompete(String t, int maxAge) {

        return canCompete(t) && this.age <= maxAge;

    }

    public boolean canCompete(int minAge) {

        return this.age >= minAge;

    }

    @Override
    public String toString() {

        return this.name + ", " + this.country + ", " + this.age;

    }
}