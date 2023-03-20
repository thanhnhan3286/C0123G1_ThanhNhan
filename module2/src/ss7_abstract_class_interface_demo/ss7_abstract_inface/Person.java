package ss7_abstract_inface;

public abstract class Person {
    protected int id;
    protected String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public abstract void howToGo();

    public abstract void doTask();
}
