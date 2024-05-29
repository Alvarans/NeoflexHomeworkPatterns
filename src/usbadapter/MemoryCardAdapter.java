package usbadapter;

public class MemoryCardAdapter extends USB {
    private final MemoryCard memoryCard;
    public MemoryCardAdapter(MemoryCard memoryCard){
        this.memoryCard = memoryCard;
    }
    @Override
    public String set() {
        return memoryCard.set();
    }
}
