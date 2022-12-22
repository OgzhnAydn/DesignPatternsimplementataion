public class Languages {

    private String name;
    private String level;
    private String  type;
    private String characteristic;
    public Languages(String name, String level, String type, String characteristic) {
        this.name = name;
        this.level = level;
        this.type = type;
        this.characteristic = characteristic;
    }



    @Override
    public String toString() {
        return "Languages{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", type='" + type + '\'' +
                ", characteristic='" + characteristic + '\'' +
                '}';
    }








}
