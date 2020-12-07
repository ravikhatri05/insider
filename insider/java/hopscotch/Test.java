package hopscotch;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Test {
    /*
    ["app.jar a","app.jar b","a c","a d"]
    String jarName;
     queue.

     0


    Map<app_name:":List<dependencies>">

    {
        app.jar:[a,b],
        a:[""]
    }
    stack ["app.jar":"a"]


     */
    public static void main(String arg[]){
    }


    public static void build(Map<String, List<String>> map, String node){
        Stack<String> stack = new Stack<String>();
        stack.push(node);
        while(!stack.isEmpty()){
             String  n1=stack.peek();
             List<String> list = map.get(n1);
             if(list.isEmpty()){
                    stack.pop();
             }
             for (String e:list) {
                    stack.push(e);
             }
        }
    }
}
