import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDesign {


    public static void main(String args[]) {

        List<Integer> list = new ArrayList(); //{1,2,3,4,5}

        List<List<Integer>> myMap = new ArrayList<>(); //{{1,2,3,4},{3,4,5},{5,6}}

        Map<String, String> map = new HashMap(); //{ {"abc",2}, {3,4} }
    }
    List<Pairs> myList = new ArrayList<>();
    public void put(int key, int val){
        for(Pairs pair : myList){
            if(pair.key == key){
                pair.val = val;
                return;
            }
        }

        Pairs myPair = new Pairs();
        myPair.key = key;
        myPair.val = val;
        myList.add(myPair);
    }

    public int get(int key){
        for (Pairs k : myList){
            if(k.key == key){
                return k.val;
            }
        }
        return -1;
    }

    public void remove(int key){
        for(int i =0; i < myList.size(); i++){
            if (myList.get(i).key == key) {
                myList.remove(i);
            }
        }
    }

    static class Pairs {
        int key;
        int val;
    }
}
