import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import com.google.common.base.Joiner;

public class ArrayToString {

	public ArrayToString() {
		// TODO Auto-generated constructor stub
	}
	
	private static String arrayTostring(String[] strs) {
      String str = "[";
      for (int i = 0; i < strs.length; i++) {
         if (i > 0) {
        	 str = str + ",";
         }
         String item = strs[i];
         str = str + item;
      }
      str = str + "]";
      return str;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using  String.join
    String[] data = {"Turn","Array", "Into", "String","In", "Java", "Example"};
    String joinedstr = String.join(" ", data);
    System.out.println(joinedstr);
    CharSequence[] vowels  = {"a", "e", "i", "o", "u"};
    String joinedvowels = String.join(",", vowels);
    System.out.println(joinedvowels);
    List<String> strList = Arrays.asList("dev", "with", "us", "blog");
    String joinedString = String.join(", ", strList);
    System.out.println(joinedString);

    // using Arrays.toString
    String[] data2 = {"Hello","Array", "String", "Conversion", "Example"};
    String joinedstr2 = Arrays.toString(data2);
    System.out.println(joinedstr2);

    //using  StringBuilder
    String[] data3 = {"Use","StringBuilder", "to", "turn", "Array","to","String","object"};
    StringBuilder stringb = new StringBuilder();
    for (int i = 0; i < data3.length; i++) {
        stringb.append(data3[i]+" ");
    }
    String joinedstr3 = stringb.toString();
    System.out.println(joinedstr3);

    // using StringJoiner
    String[] data4 = {"path", "to", "devwithus.com", "blog"};
    StringJoiner joiner = new StringJoiner("");
    for (int i = 0; i < data4.length; i++) {
       joiner.add(data4[i]+"/");
    }
    String joinedstr4 = joiner.toString();
    System.out.println("/"+joinedstr4);

    // using Java 8 Stream API
    List<String> data5 = Arrays.asList("PHP", "Java", "GoLang", "Kotlin", "Perl");
    String joinedstr5 =   data5.stream()
                               .collect(Collectors.joining(", ","[","]"));
    System.out.println(joinedstr5);

    // using StringUtils
    String[] data6 = { "John", "Karin", "Charles", "Lucas", "Diana" };
    String joinedstr6 = StringUtils.join(data6,"|");
    System.out.println(joinedstr6);

    // using Joiner
    List<String> data7 = Arrays.asList("MOSCOW", "PARIS", "LONDON", "MADRID");
    String joinedstr7 = Joiner.on(":").join(data7);
    System.out.println(joinedstr7);

    // using custom implementation
    String[] arr = { "United states", "Canada", "France", "United Kingdom" };
    String joinedstr8 = ArrayToString.arrayTostring(arr);
    System.out.println(joinedstr8);
        

	}
	

}
