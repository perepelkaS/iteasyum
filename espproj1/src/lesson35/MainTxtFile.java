package lesson35;

import java.io.*;
import java.util.Random;

public class MainTxtFile {
    public static void main(String[] args) {
        Random random = new Random();
        int age = random.nextInt(99) + 1;
        int id = random.nextInt(999) + 1;
        Person person = new Person("name " + id, age);
        System.out.println("person = " + person);
        save(person);

        Person loadePerson = load();
    }

    private static Person load() {
        try (BufferedReader reader = new BufferedReader(new FileReader("files/data.txt"))) {
            String name = reader.readLine();
            if (name == null) {
                System.err.println("Name");
                return null;
            }
            String age= reader.readLine();
            if (age == null) {
                System.err.println("Age");
                return null;
            }
            return  new Person(name,Integer.parseInt(age));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void save(Person person) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("files/data.txt"))) {
            writer.write(person.getName());
            writer.newLine();
            writer.write(String.valueOf(person.getAge()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
