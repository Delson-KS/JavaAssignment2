public abstract class Person implements Comparable<Person>{
    public Person(){
        idCounter++;
        this.id=idCounter;
    }
    private static int idCounter=0;
    private int id;
    private String name;
    private String surname;
    @Override
    public String toString(){
        return this.id+ ". " +this.name+' '+this.surname;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person(String name,String surname){
        setName(name);
        setSurname(surname);
    }

    public abstract double getPaymentAmount();
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }


}