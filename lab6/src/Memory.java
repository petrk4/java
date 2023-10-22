public class Memory {
    private int sizeGB;

    public Memory(int sizeGB) {
        this.sizeGB = sizeGB;
    }

    @Override
    public String toString() {
        return sizeGB + " GB";
    }
}
