public class Secretary extends Employee {
    public Secretary(int years) {
        super(years);
    }
    // Secretaries don't get a bonus for their years of service.
    public int getSeniorityBonus() {
        return 0;
    }
    public void takeDictation(String text) {
        System.out.println("Taking dictation of text: " + text);
    }
    @Override
    public void InCourt(){
        System.out.println("Writes down confessions");
    }
    @Override
    public int Salary(){
        return 2500;
    }
}
