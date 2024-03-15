package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        String[] reverse = new String[playList.length];

        int forwardSearch = 0;
        int backwardSearch = 0;

        //find selection word index in the array
        int indexOfSelection = 0;
        for (int i = 0; i < playList.length; i++) {
            if (playList[i].equals(selection)) {
                indexOfSelection = i;
                break;
            }
        }

        //find forward search
        forwardSearch = indexOfSelection - startIndex;


        //fill reverse array
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = playList[playList.length - 1 - i];
            System.out.println(reverse[i]);
        }

        //find reverse array selection word
        int indexOfSelectionReverse = 0;
        for (int m = 0; m < reverse.length; m++) {
            backwardSearch++;
            if (reverse[m].equals(selection)) {
                indexOfSelectionReverse = backwardSearch;
                break;
            }
        }

        //calculate backwardSearch
        backwardSearch = indexOfSelectionReverse + startIndex;

        //compare forwardSearch and backWard choose the one is minimal
        return backwardSearch > forwardSearch ? forwardSearch : backwardSearch;

    }


}
