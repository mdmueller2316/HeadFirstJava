package SerializationFileIO;

import java.io.*;

/**
 * Created by mm40 on 6/22/2016.
 */
public class FileReadWrite {
    private int power;
    private String type;
    private String[] weapons;

    FileReadWrite characterOne = new FileReadWrite(100, "elf", weapons);

    public FileReadWrite(int p, String type, String[] w) {
        power = p;
        this.type = type;
        weapons = w;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public String getWeapons() {
        String weaponList = "";

        for (int i = 0; i < weapons.length; i++) {
            weaponList += weapons[i] + " ";
        }

        return weaponList;
    }

    public void SerialSave() {

        try {
            FileOutputStream fileStream = new FileOutputStream("MyGame.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);

            os.writeObject(characterOne);

            os.close();
        } catch (Exception ex) {
            System.out.println("File not Found.");

        }
    }

    public void textSave() {
        try {
            FileWriter writer = new FileWriter("foo.txt");

            writer.write("hello foo");

            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void ReadAFile() {
        try {
            File myFile = new File("myText.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void fileObjectSave() {
        File f = new File("MyCode.txt");
        File dir = new File("Chapter7");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(f));
        } catch (IOException e) {
            e.printStackTrace();
        }
        dir.mkdir();

        if (dir.isDirectory()) {
            String[] dirContents = dir.list();

            for (int i = 0; i < dirContents.length; i++) {
                System.out.println(dirContents[i]);
            }

            boolean isDeleted = f.delete();
        }


    }
}