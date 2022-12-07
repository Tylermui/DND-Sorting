import java.util.*;
import java.io.*;

public class DnDsort {

    public static void main(String[] args) throws IOException {
        HashMap <String, HashMap<String, String>> listInput = 
        new HashMap <String, HashMap<String, String>>();

        BufferedReader file = new BufferedReader(new FileReader("characters.txt"));
        Scanner input = new Scanner(System.in);

        String line;
        //hashing the code and setting to variables
        while ((line = file.readLine()) != null) {
            HashMap<String, String> skills = new HashMap<String, String>();
            if(line.contains(" - ")) {
                String name = line;
                //taking in the rest of the lines that correlate to the name
                for (int i = 0; i < 6; i++) {
                    line = file.readLine();
                    String[] splitLine = line.split(":");
                    skills.put(splitLine[0], splitLine[1]);
                }
                listInput.put(name, skills);
            }
        }
        file.close();

        String userSkill = "";
        while(!userSkill.equals("recursion!")) {
            HashMap<String, Integer> temp = new HashMap<String, Integer>();
            System.out.println("Please enter the skill you would like to sort D&D characters by or 'recursion!' to quit: ");
            userSkill = input.nextLine().toLowerCase();
            userSkill = userSkill.substring(0,1).toUpperCase() + userSkill.substring(1);

            System.out.println("The characters are in ascending order of their " + userSkill + ":");
            //printing hashmap using for loop
            for (Map.Entry<String, HashMap<String, String>> nameEntry : listInput.entrySet()) {
                String Name = nameEntry.getKey();
                for (Map.Entry<String, String> skillEntry : nameEntry.getValue().entrySet()) {
                    String skill = skillEntry.getKey();
                    int points = Integer.parseInt(skillEntry.getValue());
                    //if the skill matches what the user input print it, maybe add it to another hashmap then print the rest run the sort method
                    if (userSkill.equals(skill)) {
                        temp.put(Name, points);
                        //System.out.println(Name + " ("  + points + ")");
                    }
                }//end inner for loop
            }//end outer for loop\
            //printing the sorted list
            HashMap<String, Integer> sorted = sortByPoints(temp);
            for (Map.Entry<String, Integer> en : sorted.entrySet()) {
                System.out.println(en.getKey() + " (" + en.getValue() + ")");
            }

        }//end while loop
        System.out.println("Bye. May the D&D use recursion on you!");
    }//end main method

    /* This methoed takes in the hashmaps and sorts it in order
     * 
     */
    public static HashMap<String, Integer> sortByPoints (HashMap<String, Integer> hm) {
        LinkedList<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
            {
                if(!o1.getValue().equals(o2.getValue()))
                    return (o1.getValue()).compareTo(o2.getValue());
                else
                    return (o1.getKey()).compareTo(o2.getKey());
            }
        });
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> each : list) {
            temp.put(each.getKey(), each.getValue());
        }

        return temp;
    }
}