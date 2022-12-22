public class LanguageFactory {
    public Languages getInstance(String str){

        if(str.endsWith("platform independent")) {
            return new Java();
        }
        else if(str.endsWith("Syntific")) {
            return new Python();
        }
        else
            return new javaScript();



    }
}
