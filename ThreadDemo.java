
import java.io.*;
import java.util.*;

class ThreadDemo extends Thread {
    Child c = null;
    String threadname;
    ThreadDemo(Child c, String threadname ) {
        this.c = c;
        this.threadname = threadname;
    }
    public static void main(String[] args) {           
        try {
            Child c1 = new Child();
            ThreadDemo t1 =   new ThreadDemo(c1, "thread 1");
            ThreadDemo t2 =   new ThreadDemo(c1, "thread 2");
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