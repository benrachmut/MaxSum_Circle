import java.util.List;

abstract public class DCOP {
    private int dcopId;
    private List<Neighbor> neighbors;
    private List<Agent> allAgents;

    public DCOP (int dcopId){
        this.dcopId= dcopId;
        createAgents();
        createNeighbors();
    }

    private void createAgents() {
        for (int i = 0; i < Main.A; i++) {

        }
        if (Main.algorithm == Main.Algorithm.maxsum){

        }
    }


}
