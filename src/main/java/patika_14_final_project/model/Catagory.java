package patika_14_final_project.model;

public class Catagory extends BaseModel {

    private String name;

    public Catagory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
