import java.awt.*;
import java.text.ChoiceFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;

//public class Test {
//    public static void main(String[] args) {
//        List<String> list = Arrays.asList("dog","over","good");
//
//        System.out.println(list.stream().reduce(new String(), (s1,s2) -> s1+s2.charAt(0), (c1,c2) -> c1+= c2));
//   //     System.out.println(list.stream().reduce(new Character(), (Character s1,s2) -> s1+ s2.charat(0), (c1,c2) -> c1+=c2)));
//list.stream().reduce((x1,x2) -> x1.length()==3 ? x1:x2).ifPresent(System.out::println);
//    }
//
//}


//public class FormatDemo {
//
//    public static void main(String[] args)
//
//try
//
//    {
//        double[] limits = {1, 2, 3};
//        String[] strArray = {"{2}", "{2}", "{2}"};
//        ChoiceFormat choiceFormat = new ChoiceFormat(limits, strArray);
//        Format[] formatArray = {choiceFormat, null, NumberFormat.getInstance()};
//        MessageFormat messageFormat = new MessageFormat("{0} out of {2}");
//        messageFormat.setFormatsByArgumentIndex(formatArray);
//        Object[] testArgs = {null, "3", null};
//
//
//        for (int i = 0; i < 4; ++i) {
//            testArgs[0] = new Integer(i);
//            testArgs[1] = testArgs[0];
//            System.out.println(messageFormat.format(testArgs));
//
//        }
//
//    } catch(
//    Exception e)
//
//    {
//        System.out.println(e.getClass());
//    }
//}
//}
