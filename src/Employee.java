class Employee extends Person implements IPayable{
    private String position;
    private double salary;
    @Override
    public String toString(){
        return this.position+": "+ super.getId() +". "+super.getName()+' '+super.getSurname();
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Employee(String john, String lennon, String founder){}
    public Employee(String _name,String _surname,String _position,double _salary){
        super.setName(_name);
        super.setSurname(_surname);
        this.setPosition(_position);
        this.setSalary(_salary);

    }

    @Override
    public double getPaymentAmount() {
        return this.salary;
    }


}