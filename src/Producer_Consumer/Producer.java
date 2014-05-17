/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Producer_Consumer;

import java.util.logging.Level;
import java.util.logging.Logger;


class Producer extends Thread
{
    Product p =new Product();

    public Producer(Product p)
    {
        this.p=p;
    }


    @Override
    public void run()
    {
        int i=0;
        while(i<=2)
        {
            try
            {
                p.Produce();
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }

            i++;
        }
    }
}



