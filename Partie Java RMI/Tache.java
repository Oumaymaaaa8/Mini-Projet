public class Tache {
    private String description;
    private int id;

    public Tache(String description, int id) {
        this.description = description;
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "[" + id + "] " + description;
    }
}
