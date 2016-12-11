package nestedclass;

/**
 * Created by PIIT_NYA on 12/11/2016.
 */
public class Othman {
    public int num1 = 10;
    InnerA innerA = new InnerA();
    InnerB innerB = new InnerB();

    public void outerMethodA(){

        innerA.innerAMethodA();
        innerB.innerBMethodB();
        System.out.println("This is outer method A");
    }

    public void outerMethodB(){
        innerA.innerAMethodA();
        innerB.innerBMethodB();
        System.out.println("This is outer method A");
    }

    public void outerMethodC(){
        innerB.innerBMethodB();
        System.out.println("This is outer method A");
    }



    private class InnerA{
        private int num2 = 12;

        private void innerAMethodA(){
            System.out.println("This is inner A Method A");
        }
    }

    private class InnerB{
        private int num3 = 15;

        private void innerBMethodB(){
            System.out.println("This is inner B Method B");
        }
    }

}
