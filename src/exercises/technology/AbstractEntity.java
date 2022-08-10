package exercises.technology;

public class AbstractEntity {
    private int id;
    private int nextId = 1;


    public AbstractEntity(){
        this.id = nextId;
        nextId++;
    }

    public int getId() {return this.id;};

}
