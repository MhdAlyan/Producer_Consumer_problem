/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Producer_Consumer;

class Product
{
    int [] arr=new int[10];

    int ProductNumber=0;

    boolean avilable=false;

    public synchronized  void Produce() throws InterruptedException
    {
       if(avilable)
            wait();

      // when I Wrote  if if(avilable) wait(); else Print Array . then ,when I Excute if condition ==> we will Not Excute Else Codition and
      //Exit from Produce to next Loop in (Run Method in producer class)

       //else

        // if not Available
       //Print Array
       {
        for(int i=0; i<10; i++)
            arr[i]=ProductNumber;

        ProductNumber++;

        avilable=true;
        
        notify();
       }
    }

    public synchronized  void Consume()throws InterruptedException
    {

        if(!avilable) // if the Product is Not avilable
             wait();

        
        //else
        //Now Product is Avialble - avilable=true
        {
            for(int i=0; i<10; i++)
                System.out.print(arr[i]);

            System.out.println("/n");

            avilable=false;//the Product is Cosumed

            notify();
        }
      }
}