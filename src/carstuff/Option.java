package carstuff;


public class Option {
    private String name;
    private String description;

    public Option (String name, String description){
        //Responsibility: constructor
        this.name = name;
        this.description = description;
    }

    public String toString(){
        //Responsibility: returns a description of the option (name, description)
        String Option = "Option(s) available:" + name + "\nDetails:" + description + "\n";
        return Option;
    }

}
