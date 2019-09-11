import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Kangaroo {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int x = v1 - v2;
        int dif = x2 - x1;

        if(x <= 0 || dif%x != 0) return "NO";

        return ((dif/x) <= 0)? "NO" : "YES";

    }
}
