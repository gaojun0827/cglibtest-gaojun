package reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 41014 on 2/7/2018.
 */
public class test01 {
    public static void main(String []args){
        List o = new ArrayList<String>();
        Method methods[] = o.getClass().getMethods();
        try{
            Method method = o.getClass().getMethod("toString",null);

            Object o1 = method.invoke(o,null);
            System.out.println(o1);
        }catch(Exception e){
            System.out.println("this method is not exist:"+ e);
        }

    }
}
