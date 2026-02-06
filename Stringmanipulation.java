
import java.util.Scanner;

public static void manipulateString(int n, String str){
    String convert = "";
    for (int i = 0 ; i <= n ; i++){

        convert = convert + str;
    }

    convert = convert.toUpperCase();

    System.out.println(convert);



    System.out.println("Length = " + convert.length());

}
public static void main(String[] args){
    manipulateString(3, "Java");
}



