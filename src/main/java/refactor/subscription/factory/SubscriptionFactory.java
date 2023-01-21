package refactor.subscription.factory;

import refactor.subscription.types.Music;
import refactor.subscription.types.Podcast;
import refactor.subscription.Subscription;
import refactor.subscription.types.Video;

public class SubscriptionFactory {

    public Subscription getinstance(String type){

        if(type.equals("Video")){
            return new Video();
        }
        else if (type.equals("Music")){
            return new Music();
        }
        return new Podcast();
    }
}
