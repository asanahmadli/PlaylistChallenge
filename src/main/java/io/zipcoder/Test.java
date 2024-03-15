package io.zipcoder;

public class Test {

    public static void main(String[] args) {
        //String[] playlist = {"dancinginthedark","rio","liveoak","liveoak"};
        String[] playlist = {"wheniseeyouagain","borntorun","nothingelsematters","cecelia"};

        String[] reverse = new String[playlist.length];
        Integer startingIndex = 1;
        String selection = "cecelia";
       // String selection = "liveoak";
        Integer expected = 2;
        //create two variables
        int forwardSearch = 0;
        int backwardSearch = 0;

        int indexOfSelection  = 0;
        for(int i=0;i<playlist.length;i++){
            if(playlist[i].equals(selection)){
                indexOfSelection=i;
                break;
            }
        }

        forwardSearch = indexOfSelection-startingIndex;


        for (int i=0;i<reverse.length;i++){
            reverse[i]=playlist[playlist.length-1-i];
            System.out.println(reverse[i]);
        }

        int indexOfSelectionReverse  = 0;
        for(int m=0;m<reverse.length;m++){
            backwardSearch++;
            if(reverse[m].equals(selection)){
                indexOfSelectionReverse=backwardSearch;
                break;
            }
        }
       backwardSearch = indexOfSelectionReverse+startingIndex;




    }
}
