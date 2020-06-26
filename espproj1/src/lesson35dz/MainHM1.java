package lesson35dz;



import lesson35.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainHM1 {

    interface FileMapper{
        void save(List<Person> persons);
        List<Person> load();
    }

    static class TextFileMapper implements FileMapper {

        @Override
        public void save(List<Person> persons) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("files/123.txt"))) {
                for (Person person: persons) {
                    writer.write(person.getName());
                    writer.newLine();
                    writer.write(String.valueOf(person.getAge()));
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public List<Person> load() {
            List<Person> result = new ArrayList<>();

            try (BufferedReader reader = new BufferedReader(new FileReader("files/123.txt"))){
                int index = 1;
                while (true) {
                    String name = reader.readLine();
                    if (name == null) {
                        //System.out.println("Error name" + index);
                        System.out.println("File end");
                        break;
                    }
                    index++;

                    String age = reader.readLine();
                    if (age == null) {
                        System.out.println("Error age" + index);
                        break;
                    }
                    index++;
                    result.add(new Person(name, Integer.parseInt(age)));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return Collections.emptyList();
        }
    }

    static class BinFileMapper implements FileMapper{

        @Override
        public void save(List<Person> persons) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("files/persons.bin"))) {
                oos.writeObject(persons);
            }  catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public List<Person> load() {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("files/persons.bin"))){
                return (List<Person>) ois.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Collections.emptyList();
        }
    }


    public static void main(String[] args) {
        FileMapper fileMapper =
                (args.length > 0 && "bin".equalsIgnoreCase(args[0]))
                 ? new BinFileMapper()
                : new TextFileMapper();

        List<Person> persons = Arrays.asList(
               new Person("Ivanov", 27),
               new Person("Sidorov", 18),
               new Person("Petrov", 32) 
        );
        
        fileMapper.save(persons);
        List<Person> loadedPersons = fileMapper.load();
        System.out.println("loaded persons = " + loadedPersons);
    }

}
