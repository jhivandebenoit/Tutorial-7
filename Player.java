public class Player {
    //Instance Variables
    private String name;
    private int age;
    private String player_type;
    private int runs;
    private int wickets;

    //Default Constructor
    public Player() {
    }

    //Contructor


    public Player(String name,int age,String player_type,int runs,int wickets) {
        this.setName(name);
        this.setAge(age);
        this.setPlayer_type(player_type);
        this.setRuns(runs);
        this.setWickets(wickets);
    }

    public double batting_avg(){
        double batting_avg = getRuns() /15.0;
        return batting_avg;
    }

    public double bowling_avg(){
        double bowling_avg = getWickets()/15.0;
        return bowling_avg;
    }

    public void get_player_details(){
        System.out.println("Name: "+ getName());
        System.out.println("Age: "+ getAge());
        System.out.println("Type of player: "+ getPlayer_type());
        System.out.println("No. of Wickets scored: "+ getWickets());
        System.out.println("No. of runs: "+ getRuns());
    }

    public String get_player_type(){
        return getPlayer_type();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlayer_type() {
        return player_type;
    }

    public void setPlayer_type(String player_type) {
        this.player_type = player_type;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }
}


