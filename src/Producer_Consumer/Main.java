
package Producer_Consumer;

import java.*;

public class Main
{
    public static void main(String[] args)
    {
        Product p=new Product();

        Producer prod=new Producer(p);

        Consumer cons=new Consumer(p);

        prod.start();

        cons.start();
    }
}
