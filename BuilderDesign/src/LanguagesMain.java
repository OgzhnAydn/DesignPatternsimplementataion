public class LanguagesMain {

     public static void main(String[] args) {

         Languages lng=new LanguageBuilder().setName("java").setCharacteristic("imperative").getLanguages();
         System.out.println(lng);


    }
}
