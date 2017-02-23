
import java.io.*;
import java.util.*;

class RunnableDemo implements Runnable{
    Child c ;
    String threadname;
    RunnableDemo(Child c, String threadname ) {
        this.c = c;
        this.threadname = threadname;
    }
    public static void main(String[] args) { 
        try {
            Child c1 = new Child();
            Thread t1 = new Thread(new RunnableDemo(c1, "thread 1")); 
            Thread t2 = new Thread(new RunnableDemo(c1, "thread 2")); 
            t1.start();
            t2.start();
        } catch(IllegalThreadStateException e) {
            e.printStackTrace();
        }        
    }    
    public void run() {
        c.display(threadname);
    }
}

class Child {    
    public synchronized void display(String threadname) {
        for(int i = 1; i<4;i++) {
            System.out.println("counter of " + threadname + " : " + i );
        }
    }
}  
