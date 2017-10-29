class threatOne extends Thread
{
    @Override
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            try{
                sleep(1000);
            }catch(InterruptedException e){}

            System.out.println("Thraet one!");
        }
    }
}

class threatTwo extends Thread
{
    @Override
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            try{
                sleep(1000);
            }catch(InterruptedException e){}

            System.out.println("Thraet two!");
        }
    }
}

public class SoftHome10
{
    static threatOne mAnotherOpinion;
    static threatTwo mAnotherOpinion2;

    public static void main(String[] args)
    {
        mAnotherOpinion = new threatOne();
        mAnotherOpinion2 = new threatTwo();
        System.out.println("Start");
        mAnotherOpinion.start();
        mAnotherOpinion2.start();

        for(int i = 0; i < 5; i++)
        {
            try{
                mAnotherOpinion.join();
                mAnotherOpinion2.join();
            }catch(InterruptedException e){}

            System.out.println("Threat three!");
        }

        System.out.println("End main!");
    }
}