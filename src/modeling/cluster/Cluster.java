package modeling.cluster;

public class Cluster {

    private final int memoryChunks;
    private final int coresNumber;

    public Cluster(int memoryChunks, int coresNumber) {
        this.memoryChunks = memoryChunks;
        this.coresNumber = coresNumber;
    }

    public int getMemoryChunks() {
        return memoryChunks;
    }

    public int getCoresNumber() {
        return coresNumber;
    }
}
