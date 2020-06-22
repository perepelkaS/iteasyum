package lesson35;

import java.io.*;

public class MainBinFile {
    public static void main(String[] args) {
        Person person = new Person("Ivanov", 27);
        System.out.println("person = " + person);
        save(person);
        Person loadedPerson = load();
        System.out.println("loaded = " + loadedPerson);
    }

    private static Person load() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("files/data.bin"))) {
            return new Person(dis.readUTF(), dis.readInt());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void save(Person person) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("files/data.bin"))) {
            dos.writeUTF(person.getName());
            dos.writeInt(person.getAge());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
