public class Animal {
    // this will be my super class with all the basic characterstics of an animal
    private String name;  // these are all the fields.
    private String body;
    private String life;
    private int size;
    private int weight;

    public Animal(String name, String body, String life, int size, int weight){
        this.name = name;
        this.body = body;
        this.life = life;
        this.size = size;
        this.weight = weight;  // constructor for the class.
    }

    public String getName(){
        return this.name;
    }

    public String getBody(){
        return this.body;
    }

    public String getLife(){
        return this.life;
    }

    public int getWeight(){
        return this.weight;
    }

    public int getSize(){
        return this.size;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBody(String body){
        this.body = body;

    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLife(String life){
        this.life = life;
    }

    public void setSize(int size){
        this.size = size;
    }

    public String greet(){
        return "This is an ";
    }


}
