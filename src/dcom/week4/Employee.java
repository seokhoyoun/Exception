package dcom.week4;

public class Employee {
	// Field
	private String name; // 사원명
	private int age; // 나이
	private int salary; // 급여
	private double t_rate; // 세율
	private double t_income; // 실급여
	// Constructor
	public Employee() {
		
	}
	public Employee(String name, int age, int salary, double t_rate) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.t_rate = t_rate;
		this.t_income = Math.floor(t_rate*100)/100.0;
	}
	public Employee(String name, int age, int salary, double t_rate, double t_income) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.t_rate = t_rate;
		this.t_income = t_income;
	}
	// Getter and Setter
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getT_rate() {
		return t_rate;
	}
	public void setT_rate(double t_rate) {
		this.t_rate = Math.floor(t_rate*100)/100.0;
	}
	public double getT_income() {
		return t_income;
	}
	public void setT_income(double t_income) {
		this.t_income = t_income;
	}
	// Method
	@Override
	public String toString() {
		return this.name+", "+this.age+", "+this.salary+", "+this.t_rate+", "+this.t_income;
	}
	
	public double cal_Income() {
		this.t_income = this.salary - (this.salary*this.t_rate);
		return this.t_income;
	}
	
	
}
