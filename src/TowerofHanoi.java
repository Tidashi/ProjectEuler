import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class TowerofHanoi {
    public static void main(String[] args){
        ArrayList<Character> peg1 = new ArrayList<>();
        peg1.add('a');
        peg1.add('b');
        peg1.add('c');
        //moveDisk(3, 'a','b','c');
       moveDisk(3,peg1);
    }
    static void moveDisk(int count, ArrayList<Character> a){ //def
        ArrayList<Character> b = new ArrayList<>();
        b.add('a');
        b.add('c');
        b.add('b');
        ArrayList<Character> c = new ArrayList<>();
        c.add('b');
        c.add('c');
        c.add('a');
    if (count == 1)
        System.out.println("Moving disk " + count + " from Peg " +
                a.get(0) + " to Peg " + a.get(1));
    else {
        moveDisk(count - 1, b);
        System.out.println("Move disk " + count + " from Peg " +
                a.get(0) + " to Peg " + a.get(2));
        moveDisk(count - 1, c);
    }
}
}
