/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Producer_Consumer;

import java.util.logging.Level;
import java.util.logging.Logger;

class Consumer extends Thread
{
    Product p =new Product();

    public Consumer(Product p)
    {
        this.p=p;
    }

    @Override
    public void run()
    {
        int i=0;

        while(i<=2)
        {
            try {
                p.Consume();
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }

            i++;
        }
    }
}
