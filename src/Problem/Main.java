package Problem;

public class Main {
    public static void main(String[] args){
        PointService service = new PointService();
        for(var point: service.getPoints())
            point.draw();
    }
}
