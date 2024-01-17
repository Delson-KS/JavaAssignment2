class Student extends Person {

    private double gpa;
    @Override
    public String toString() {
        return "Student: " + super.getId() + ". " + super.getName() + ' ' + super.getSurname();
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }
    public Student(String name, String surname, double _gpa){
        super.setName(name);
        super.setSurname(surname);
        this.setGpa(_gpa);

    }


    @Override
    public double getPaymentAmount() {
        if(this.gpa>2.67){
            return 36660;
        }
        else
            return  0;
    }


}