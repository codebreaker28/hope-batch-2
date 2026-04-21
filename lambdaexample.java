@FunctionalInterface
interface Math {
    int add(int a, int b);
}
interface Excercise{
    void sayHello();
}
public class lambdaexample {
    /*public static int add (int a,int b){
        return a+b;
    }*/
    
    public static void main(String[] args){
        //System.out.println(add(22,33));
        /*Math addfunc = new Math(){
            @Override
            public int add(int a, int b){
                return a+b;
            }
        };
        System.out.println(addfunc.add(22, 33));*/
        Math obj = (a,b) -> a+b; // lambda expression
        System.out.println(obj.add(22, 33));
    }
}
