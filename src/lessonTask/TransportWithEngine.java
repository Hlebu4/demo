package lessonTask;

public class TransportWithEngine extends Vehicle{


    public TransportWithEngine(String model, String name) {
        super(model, name);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void speedUp() {
        super.speedUp();
    }

    @Override
    public void speedDown() {
        super.speedDown();
    }

    public void engineStart(){
        System.out.println("Engine Start ");
    }
     public void  engineStop(){
         System.out.println("Engine Stop ");
     }
}
