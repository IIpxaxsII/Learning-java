class computer{
        public void playMusic(){
            System.out.println("Music is being played!");
        }

        public String getPen(int cost){

            return "Pen";
        }

    }


public class  classes01{    

    public static void main(String[] args) {

        computer obj = new computer();
        obj.playMusic();
        System.out.println(obj.getPen(10));
    }
    }
    


