package JCPTermin2;

import static com.sun.javafx.fxml.expression.Expression.add;

/**
 *
 * @author lukak
 */
public class UnarniOperaters {
    public static void main(String[] args) {
        int a = 5;
        a = a + 1;
        // a+=1; je isto kao da sam napisao a=a+1;
        a +=1; 
        //Inkrement
        a++;
        //Dekrement
        a--;
        boolean isOk = false;
        isOk = !isOk;
        
        int x = 5;
        System.out.println("X is: " + x);
        x++;
        System.out.println("X is: " + x);
        System.out.println("X is: " + x++);
        System.out.println("X is: " + ++x);
        System.out.println("X is: " + x);
        
        int u = 5, v = 7;
        //System.out.println(u = v); //nije dobro
        System.out.println(u==v);
        
        //Inkrement
        int y =2, b=3;
        int res = y*(b++)+b;  // 10
        int res1 = y*(++b)+b; // 15
        System.out.println(res);
        System.out.println(res1);
        
        int z = 2, h=3;
        add(z,h++); //5
        add(z,++h); //7
        
        
        
    }
    
}
