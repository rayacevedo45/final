package states;

import java.util.HashMap;
import java.util.Map;

public class USStates {

    /**
     * Count states by their first letter.
     *
     * @return
     *   A map from the initial (capital) letter to the number of states whose
     *   names start with that letter.  The map should have exactly 26 keys, one
     *   for each letter of the alphabet.  For example, 'A' should be a key with
     *   value 4 (Alabama, Alaska, Arizona, Arkansas), and 'B' should be a key
     *   with value 0.
     */
    public static Map<Character, Integer> countStatesByFirstLetter() {
        // TODO: Write this method
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        String state;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int ii = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n = 0;
        int o = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        int s = 0;
        int t = 0;
        int u = 0;
        int v = 0;
        int w = 0;
        int x = 0;
        int y = 0;
        int z = 0;



        map.put('A',0);
        map.put('B',0);
        map.put('C',0);
        map.put('D',0);
        map.put('E',0);
        map.put('F',0);
        map.put('G',0);
        map.put('H',0);
        map.put('I',0);
        map.put('J',0);
        map.put('K',0);
        map.put('L',0);
        map.put('M',0);
        map.put('N',0);
        map.put('O',0);
        map.put('P',0);
        map.put('Q',0);
        map.put('R',0);
        map.put('S',0);
        map.put('T',0);
        map.put('U',0);
        map.put('V',0);
        map.put('W',0);
        map.put('X',0);
        map.put('Y',0);
        map.put('Z',0);


        for(int i = 0; i < STATE_NAMES.length; i++){
            state = STATE_NAMES[i];
            if (state.substring(0,1).equals("A")){
                a++;
                map.put('A',a);
            }
            else if (state.substring(0,1).equals("B")){
                b++;
                map.put('B',b);
            }
            else if (state.substring(0,1).equals("C")){
                c++;
                map.put('C',c);
            }
            else if (state.substring(0,1).equals("D")){
                d++;
                map.put('D',d);
            }
            else if (state.substring(0,1).equals("E")){
                e++;
                map.put('E',e);
            }
            else if (state.substring(0,1).equals("F")){
                f++;
                map.put('F',f);
            }
            else if (state.substring(0,1).equals("G")){
                g++;
                map.put('G',g);
            }
            else if (state.substring(0,1).equals("H")){
                h++;
                map.put('H',h);
            }
            else if (state.substring(0,1).equals("I")){
                ii++;
                map.put('I',ii);
            }
            else if (state.substring(0,1).equals("J")){
                j++;
                map.put('J',j);
            }
            else if (state.substring(0,1).equals("K")){
                k++;
                map.put('K',k);
            }
            else if (state.substring(0,1).equals("L")){
                l++;
                map.put('L',l);
            }
            else if (state.substring(0,1).equals("M")){
                m++;
                map.put('M',m);
            }
            else if (state.substring(0,1).equals("N")){
                n++;
                map.put('N',n);
            }
            else if (state.substring(0,1).equals("O")){
                o++;
                map.put('O',o);
            }
            else if (state.substring(0,1).equals("P")){
                p++;
                map.put('P',p);
            }
            else if (state.substring(0,1).equals("Q")){
                q++;
                map.put('Q',q);
            }
            else if (state.substring(0,1).equals("R")){
                r++;
                map.put('R',r);
            }
            else if (state.substring(0,1).equals("S")){
                s++;
                map.put('S',s);
            }
            else if (state.substring(0,1).equals("T")){
                t++;
                map.put('T',t);
            }
            else if (state.substring(0,1).equals("U")){
                u++;
                map.put('U',u);
            }
            else if (state.substring(0,1).equals("V")){
                v++;
                map.put('V',v);
            }
            else if (state.substring(0,1).equals("W")){
                w++;
                map.put('W',w);
            }
            else if (state.substring(0,1).equals("X")){
                x++;
                map.put('X',x);
            }
            else if (state.substring(0,1).equals("Y")){
                y++;
                map.put('Y',y);
            }
            else {
                z++;
                map.put('Z',z);
            }
        }
        return map;
    }

    public static void main(String[] args) {

        Map<Character, Integer> counts = countStatesByFirstLetter();
        System.out.println(counts.size());
        // Do some simple tests.  Feel free to add your own.
        if (counts.size() != 26) throw new AssertionError();
        if (!counts.containsKey('A')) throw new AssertionError();
        if (counts.get('A') != 4) throw new AssertionError();
        if (!counts.containsKey('B')) throw new AssertionError();
        if (counts.get('B') != 0) throw new AssertionError();
        System.out.println(counts.get('W'));
        System.out.println(counts.get('Z'));
        System.out.println(counts.get('C'));
        System.out.println(counts.get('D'));


    }

    public static final String[] STATE_NAMES = {
            "Alabama",
            "Alaska",
            "Arizona",
            "Arkansas",
            "California",
            "Colorado",
            "Connecticut",
            "Delaware",
            "Florida",
            "Georgia",
            "Hawaii",
            "Idaho",
            "Illinois",
            "Indiana",
            "Iowa",
            "Kansas",
            "Kentucky",
            "Louisiana",
            "Maine",
            "Maryland",
            "Massachusetts",
            "Michigan",
            "Minnesota",
            "Mississippi",
            "Missouri",
            "Montana",
            "Nebraska",
            "Nevada",
            "New Hampshire",
            "New Jersey",
            "New Mexico",
            "New York",
            "North Carolina",
            "North Dakota",
            "Ohio",
            "Oklahoma",
            "Oregon",
            "Pennsylvania",
            "Rhode Island",
            "South Carolina",
            "South Dakota",
            "Tennessee",
            "Texas",
            "Utah",
            "Vermont",
            "Virginia",
            "Washington",
            "West Virginia",
            "Wisconsin",
            "Wyoming",
    };
}
