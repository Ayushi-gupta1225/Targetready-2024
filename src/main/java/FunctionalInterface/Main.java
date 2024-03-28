package FunctionalInterface;

public class Main {
    public static void main(String[] args) {
//        Myinterface myinter=new Myinterfaceimplement();
//        myinter.sayHello();


//        Myinterface i=new Myinterface() {
//            @Override
//            public void sayHello() {
//                System.out.println("this is anonymous class");
//            }
//        };
//        i.sayHello();

        //using our interface with the help of lamda
        Myinterface i=()->{
            System.out.println("first time i used lamda");
        };
        i.sayHello();
        }
    }

