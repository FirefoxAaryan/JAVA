import java.util.Arrays;

public class VariableLengthArguments {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,50);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
