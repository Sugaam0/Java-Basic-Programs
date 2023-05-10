package Inheritance;

public class Employee {
    private String name;
    private int id,mS;

    public Employee(String name, int id, int mS)
        {
            this.name=name;
            this.id=id;
            this.mS=mS;
        }
    public int getYearlySalary()
        {
            return mS*12;
        }
        @Override
    public String toString()
        {
            return "Name = " + this.name + "\n" + "Id = " + this.id + "\n" + "Monthly Salary = " + this.mS ;
        }
}

 class Teacher extends Employee   
    {
        private int numSub;

        public Teacher(String name, int id, int mS, int numSub)
            {
                super(name,id,mS);
                this.numSub = numSub;
            }
        public int getTeacherYearlySalary()
            {
                return super.getYearlySalary() + this.numSub*1000;
            }
        public String getDetails()
            {
                return "\n" + super.toString() + "\n" + "Number of subjects = " + this.numSub;
            }
    }
class test
    {
        public static void main(String[] args) {
            Teacher t = new Teacher("Arun",1011,10000,4);
            System.out.println(t.getDetails());
            

        }
    }

