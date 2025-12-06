package iterator;

public class MainIterator {

    public static void main(String[] args) {
        ChannelCollection channels = populateChannels();
        ChannelIterator baseIterator = channels.iterator(ChannelType.TODOS);
        while (baseIterator.hasNext()) {
            Channel c = baseIterator.next();
            System.out.println(c.toString());
        }
        System.out.println("******");
        // Channel Type Iterator
        ChannelIterator englishIterator = channels.iterator(ChannelType.INGLES);
        while (englishIterator.hasNext()) {
            Channel c = englishIterator.next();
            System.out.println(c.toString());
        }
    }

    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelType.INGLES));
        channels.addChannel(new Channel(99.5, ChannelType.FRANCES));
        channels.addChannel(new Channel(100.5, ChannelType.ESPANOL));
        channels.addChannel(new Channel(101.5, ChannelType.INGLES));
        channels.addChannel(new Channel(102.5, ChannelType.FRANCES));
        channels.addChannel(new Channel(103.5, ChannelType.ESPANOL));
        channels.addChannel(new Channel(104.5, ChannelType.INGLES));
        channels.addChannel(new Channel(105.5, ChannelType.FRANCES));
        channels.addChannel(new Channel(106.5, ChannelType.ESPANOL));
        return channels;
    }
}
