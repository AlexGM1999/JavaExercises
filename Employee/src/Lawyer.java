public class Lawyer extends Employee {
    public Lawyer(int years) {
        super(years);
    }
    public void Sue(){
        System.out.println("Im suing you");
    }
    @Override
    public void InCourt() {
        System.out.println("Convincing the jury");
    }
    @Override
    public int Salary(){
        return 4500;
    }
}