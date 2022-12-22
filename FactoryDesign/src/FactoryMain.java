public class FactoryMain {

     public static void main(String[] args) {

       LanguageFactory languageFactory=new LanguageFactory();
        Languages obj=languageFactory.getInstance("Syntific");
        obj.spec();




     }

}
