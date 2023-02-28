package dice;
import java.util.*;
public class Die {/
    private static final int max_number = 6;

    private static final int min_number = 1;

    private static final int no_number = 6;

    private int number;
    private Random random;

    public Die (){//the consturactor method.
        random = new Random();
        number = no_number;
    }
    public void roll(){
        number = random.nextInt(max_number-min_number+1) + min_number;
    }
    public int getNumber(){
        return number;
    }
}   
