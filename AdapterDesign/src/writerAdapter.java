public class writerAdapter implements Java{
     Python python=new Python();
    @Override
    public void write(String str) {
        python.write(str);

    }
}
