import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaverText {

    public SaverText() {
    }

    public void save (String adress, String str){

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(adress)))
        {

            bw.write(str);

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String toString() {
        return "SaverText{}";
    }
}


