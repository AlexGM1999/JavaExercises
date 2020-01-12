public class Employee {
        private int years;
        public Employee(int years) {
            this.years = years;
        }
        public int getVacationDays() {
            return 10 + getSeniorityBonus();
        }

        public int getSeniorityBonus() {
            return 2 * years;
        }

        public void InCourt(){
            System.out.println("Stays outside");
        }


        public int Salary(){
            return 1500;
    }
    }

