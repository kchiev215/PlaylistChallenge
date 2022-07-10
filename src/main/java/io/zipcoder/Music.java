package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
//        return null;
        int forward = goingForward(startIndex, selection);
        int backwards = goingBackwards(startIndex, selection);

        if (backwards > forward) {
            return forward;
        } else {
            return backwards;
        }
    }

    public Integer goingForward(Integer startIndex, String selection) {
        int forward = 0;
        for (int i = startIndex; !playList[i].contains(selection); i++) {
            if (i == playList.length - 1) {
                i = -1;
            }
            forward++;

        }
        return forward;
    }


    public Integer goingBackwards(Integer startIndex, String selection){
        int backward = 0;
        for(int i = startIndex; !playList[i].contains(selection); i--){
            if(i == 0){
                i = playList.length;
            } backward++;

        } return backward;
    }
}
