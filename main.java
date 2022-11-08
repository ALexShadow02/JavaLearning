import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        var out = System.out;
        out.println(DateTimeFormatter.ofPattern("dd-MM(yy) HH:mm:ss").format(LocalDateTime.now()));
    }
}

