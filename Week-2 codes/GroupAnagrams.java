import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of words: ");

        int n=sc.nextInt();

        String[] words=new String[n];

        System.out.println("Enter words:");

        for(int i=0;i<n;i++)
            words[i]=sc.next();

        HashMap<String,List<String>> map=new HashMap<>();

        for(String word:words){

            char[] ch=word.toCharArray();
            Arrays.sort(ch);

            String key=new String(ch);

            map.putIfAbsent(key,new ArrayList<>());

            map.get(key).add(word);
        }

        System.out.println("Grouped Anagrams:");

        for(List<String> list:map.values()){
            System.out.println(list);
        }

        sc.close();
    }
}