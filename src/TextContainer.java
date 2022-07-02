public class TextContainer {

    public TextContainer() {
    }

    @SaveTo(file = "d:\\file.txt")
    public static class Containre {
      public String str ="stroka";


    @Saver
    public void save (String ad){

        SaverText st = new SaverText();
        st.save(ad,str);



      }
    }

    @Override
    public String toString() {
        return "TextContainer{}";
    }
}
