public class LanguageBuilder {
    private String name;
    private String level;
    private String  type;
    private String characteristic;



    public LanguageBuilder setName(String name) {
        this.name = name;
        return this;

    }

    public LanguageBuilder setLevel(String level) {
        this.level = level;
        return this;
    }
    public LanguageBuilder setType(String type) {
        this.type = type;
        return this;
    }

     public LanguageBuilder setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
        return this;
    }

    public Languages getLanguages(){

        return new Languages(name,level,type,characteristic);
    }





}
