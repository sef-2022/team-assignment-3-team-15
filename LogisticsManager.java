public class LogisticsManager extends EventManagementTeam {
    
    public void deliverAddition(Event event, Addition addition){
        if (addition instanceof MusicBand){
            event.setDeliverMusicBand(true);
            System.out.println("Delivered " + event.getMusicBand().getName());
        }
        else if (addition instanceof SoundSystem){
            event.setDeliverSoundSystem(true);
            System.out.println("Delivered " + event.getSoundSystem().getType());
        }
        else if (addition instanceof FlowerArrange){
            event.setDeliverFlowerDecor(true);
            System.out.println("Delivered " + event.getFlowerArrange().getArrangementType());
        }
    }
    public void orderAddition(Addition addition){
        addition.setOrdered(true);
        System.out.println("Ordered addition");
    }
}