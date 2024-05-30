package End2020.Paper2.Q2;
import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;

public class HelperClass {
    static public String[] readLinesToArray() throws IOException {
        LinkedList<String> lines = new LinkedList<>();
        File file = new File("/Users/anukahettiarachchi/Desktop/DataStructuresInJava/src/End2020/Paper2/Q2/data.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while((line=br.readLine())!=null)
        {     //line feed
            String changes = line.replaceAll("[\\n\\r\\t]+", "");
            lines.add(changes);
        }

        fr.close();
        String array[] = lines.toArray(new String[0]);
        return array;
    }

    static TAG_TYPE getTagType(String line){
        String[] opening = {"pdnml","table","metadata","thead","tbody","row","group","item","tablename","tableid"};
        String[] closing = {"/pdnml","/table","/metadata","/thead","/tbody","/row","/group","/item","/tablename","/tableid"};

        String tag = line.split(",")[0];

        //Check whether tag is an opening tag
        boolean isOpening = Arrays.stream(opening).anyMatch(tag::equals);

        if(isOpening){
            return TAG_TYPE.opening;
        }

        //Check whether tag is a closing tag
        boolean isClosing = Arrays.stream(closing).anyMatch(tag::equals);

        if(isClosing){
            return TAG_TYPE.closing;
        }

        //If it's not an opening or closing it must be content
        return TAG_TYPE.content;
    }

    static public String getTag(String line){
        return line.split(",")[0];
    }

    static public String[] getVar(String var){
        String[] arr = var.split("=");
        return arr;
    }

    static public String getId(String line){
        String elements[] = line.split(",");
        TAG_TYPE type = getTagType(elements[0]);
        if(type == TAG_TYPE.opening){
            if(elements.length > 1){
                //the element has className or an id
                for(String i: elements){
                    String[] var = getVar(i);

                    if(var[0].equals("id")){
                        return var[1];
                    }
                }
            }
        }

        return null;
    }

    static public String getClassName(String line){
        String elements[] = line.split(",");
        TAG_TYPE type = getTagType(elements[0]);
        if(type == TAG_TYPE.opening){
            if(elements.length > 1){
                //the element has className or an id
                for(String i: elements){
                    String[] var = getVar(i);

                    if(var[0].equals("className")){
                        return var[1];
                    }
                }
            }
        }

        return null;
    }
}
