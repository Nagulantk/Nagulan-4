public class Main {
    public static void main(String[] args) {
        Salary employee=new HR();
        employee.salaryCalculation(20);
         employee=new LeadEngineer();
        employee.salaryCalculation(25);
        employee=new MemberTechnicalStaff();
        employee.salaryCalculation(24);
        employee=new ProjectTrainee();
        employee.salaryCalculation(23);
        employee=new Intern();
        employee.salaryCalculation(24);


    }
}
abstract class Salary{
    int salary;
    int pf;
   abstract public void salaryCalculation(int days);

}
class HR extends Salary
{

    public void salaryCalculation(int days)
    {
        this.salary=days*4000;
        pf=(int)(salary*0.12);
        this.salary=this.salary-pf;
        System.out.println("Hr salary:"+salary);
    }
}
class LeadEngineer extends HR
{
    public void salaryCalculation(int days)
    {
        this.salary=days*2500;
        pf=(int)(salary*0.12);
        this.salary=this.salary-pf;
        System.out.println("Lead Engineer salary:"+salary);

    }
}
class MemberTechnicalStaff extends HR{
    public void salaryCalculation(int days)
    {
        this.salary=days*2000;
        pf=(int)(salary*0.12);
        this.salary=this.salary-pf;
        System.out.println("Member technical staff salary:"+salary);

    }
}
class ProjectTrainee extends HR
{
    public void salaryCalculation(int days)
    {
        this.salary=days*1000;
        System.out.println("Project trainee salary:"+salary);
    }
}
class Intern extends HR
{
    public void salaryCalculation(int days)
    {
        this.salary=days*500;
        System.out.println("Intern :"+salary);
    }
}





