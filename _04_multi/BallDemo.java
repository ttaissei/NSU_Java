package _04_multi;

class Ball{
    double radius;
    public double getvolume(){
        return 4/3*3.14*radius*radius*radius;
    }
}
public class BallDemo {
    public static void main(String[] args) {

        Ball ball = new Ball();
        ball.radius = 10.0;
        System.out.println("면적은 " + ball.getvolume());

    }
}
