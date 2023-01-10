import java.util.List;

abstract public class Agent {
    private List<String> neighbors;

    public abstract  void receiveMsg();
    public abstract  void compute();
    public abstract  void createMsgs();
    public abstract  void sendMsgs();





}
